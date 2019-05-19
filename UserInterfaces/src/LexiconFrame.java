import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.*;

public class LexiconFrame extends JFrame implements ActionListener {
    private JTextField f_name_tf;
    private JTextField l_name_tf;
    private JTextField n_name_tf;
    private JCheckBox is_homo;

    LexiconFrame(){
        super("LeXiCon");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width/2, screenSize.height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //frame.setResizable(false); ==> use to make unresizable
        JPanel top = new JPanel();
        JPanel form = new JPanel();
        JPanel bottom = new JPanel();
        JMenuBar menu = new JMenuBar();
        JMenu options = new JMenu("Options");
        JMenu backgroundColor = new JMenu("Bg Colors");
        JMenuItem mint = new JMenuItem("Mint green");
        JMenuItem yellow = new JMenuItem("Yellow");
        JMenuItem grey_black = new JMenuItem("Gray black");
        JMenuItem exit = new JMenuItem("Exit");
        JMenu furthercolorOpt = new JMenu("Further...");
        JMenuItem colorPicker = new JMenuItem("Color picker");
        JCheckBoxMenuItem include_alpha = new JCheckBoxMenuItem("Include alpha channel in color?");

        options.add(exit);

        furthercolorOpt.add(colorPicker);
        furthercolorOpt.addSeparator();
        furthercolorOpt.add(include_alpha);

        backgroundColor.add(mint);
        backgroundColor.add(yellow);
        backgroundColor.add(grey_black);
        backgroundColor.add(furthercolorOpt);

        menu.add(options);
        menu.add(backgroundColor);

        JLabel title = new JLabel("My LeXiCon, please fill it out and NO rude words!!!!!!");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setOpaque(true);
        top.setBorder(new EmptyBorder(20,0,20,0));
        bottom.setBorder(new EmptyBorder(20,0,20,0));
        top.setToolTipText("It had to have a unicorn, BUT..."); // sets some hover text - useful...

        JLabel f_name_l = new JLabel("Your first name:");
        f_name_tf = new JTextField("Ex: John");
        f_name_tf.setPreferredSize(new Dimension(130,20));
        //f_name_l.setBorder(new EmptyBorder(10,20,10,20)); --> could be done, but insets is a better way...

        JLabel l_name_l = new JLabel("Your last name:");
        l_name_tf = new JTextField("Ex: Doe");
        l_name_tf.setPreferredSize(new Dimension(130,20));

        JLabel n_name_l = new JLabel("Your nickname:");
        n_name_tf = new JTextField("Ex: The pelmeninator");
        n_name_tf.setPreferredSize(new Dimension(130,20));
        f_name_l.setHorizontalAlignment(SwingConstants.RIGHT);
        l_name_l.setHorizontalAlignment(SwingConstants.RIGHT);
        n_name_l.setHorizontalAlignment(SwingConstants.RIGHT);

        form.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10,10);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        form.add(f_name_l, c);
        c.gridx = 1;
        c.gridy = 0;
        form.add(f_name_tf, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(l_name_l, c);
        c.gridx = 1;
        c.gridy = 1;
        form.add(l_name_tf, c);
        c.gridx = 0;
        c.gridy = 2;
        form.add(n_name_l,c);
        c.gridx = 1;
        c.gridy = 2;
        form.add(n_name_tf,c);

        is_homo = new JCheckBox("Are you homo???");
        JButton send = new JButton("Send your answers");

        bottom.add(is_homo);
        bottom.add(send);


        top.add(title);
        setJMenuBar(menu);


        add(top, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        //add event handlers...
        send.addActionListener(this);
        is_homo.addActionListener(this);
        MenuListener ml = new MenuListener(top, form, bottom, title, is_homo);

        exit.addActionListener(ml);
        mint.addActionListener(ml);
        yellow.addActionListener(ml);
        grey_black.addActionListener(ml);
        colorPicker.addActionListener(ml);
        include_alpha.addActionListener(ml);

//        this.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("we clicked");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("mouse is pressed - FIRE!");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("we released - stop the fire!");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                System.out.println("we entered a target");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println("we exited that target");
//            }
//        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Are you homo???")) System.out.println(":: pressed the HOMO cb ::");
        else {
            String first_name = f_name_tf.getText(), last_name = l_name_tf.getText(), nickname = n_name_tf.getText();
            Boolean homo = is_homo.isSelected();
            try {
                LexiconEntry le = new LexiconEntry(first_name,last_name, nickname, homo);
                System.out.println(le.toString());
                LexiconEntry.add(le);
                LexiconEntry.printAllEntries();
            } catch (UserException exception){
               if(exception.getCode()==UserException.NO_F_NAME) showErr("First name is required!");
               if(exception.getCode()==UserException.NO_L_NAME) showErr("Last name is required!");
            }
        }

    }

    private void showErr(String errMsg){
        JOptionPane.showMessageDialog(this, errMsg, "An error has occurred", JOptionPane.ERROR_MESSAGE);
    }

}
