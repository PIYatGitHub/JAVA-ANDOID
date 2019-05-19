import java.awt.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

    public static void main(String[] args) throws Exception {
        String[][] rates = getRates();
//        int rates_len = rates.length;
//        for(int i=0; i<rates_len; i+=1) {
//            System.out.println(rates[i][0] + " <----> " + rates[i][1]); // works fine we are
//                                                                        // good to go!
//        }
        JFrame currencies = new JFrame();
        currencies.setTitle("Currency course");
        currencies.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String [] colNames = {"Currency code", "Unit price (ex: 1CHF buys ... RU)" };
        JTable table = new JTable(rates, colNames);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 20));

        table.setFont(new Font("Serif", Font.PLAIN, 18));
        table.setRowHeight(table.getRowHeight() + 18);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);

        JScrollPane scrollPane = new JScrollPane(table);
        currencies.add(scrollPane);

        currencies.pack();
        currencies.setLocationRelativeTo(null);
        currencies.setVisible(true);
    }

    private static String[][] getRates() throws Exception {
        HashMap<String, NodeList> result = new HashMap<>();
        String[][] rates;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String url = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=" + dateFormat.format(date);
        Document doc = loadDocument(url);
        System.out.println(doc.getXmlVersion());

        NodeList nl = doc.getElementsByTagName("Valute");
        int len = nl.getLength();
        for (int i=0; i<len; i+=1) {
            Node c = nl.item(i); // we have the element!
            NodeList nl_child = c.getChildNodes();  // we have the inner contents!
            int temp_len = nl_child.getLength();
            for(int k=0; k<temp_len; k+=1) {
                if(nl_child.item(k).getNodeName().equals("CharCode")) {
                    result.put(nl_child.item(k).getTextContent(),nl_child);
                }
            }
        }

        int j = 0;
        rates = new String[result.size()][2];

        for (Map.Entry<String,NodeList> entry : result.entrySet()) {
            NodeList temp = entry.getValue();
            int tmp_len = temp.getLength();
            double value = 0;
            int nominal = 0;
            for(int q=0; q<tmp_len; q+=1) {
                if(temp.item(q).getNodeName().equals("Value")) {
                    value = Double.parseDouble(temp.item(q).getTextContent().replace(',', '.'));
                }else if(temp.item(q).getNodeName().equals("Nominal")) {
                    nominal = Integer.parseInt(temp.item(q).getTextContent());
                }
            }
            double amount = value/nominal;
            rates[j][0] = entry.getKey();
            rates[j][1] = ((double)Math.round(amount*10000)/10000) + " roubles";
            j+=1;
        }
        return rates;
    }

    private static Document loadDocument(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }

}
