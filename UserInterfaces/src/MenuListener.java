import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
    private JPanel top, mid, bottom;
    private JLabel heading;
    private JCheckBox is_homo;
    private Color mint_green =  new java.awt.Color(100, 247, 178);
    private Color gret_yellow = new java.awt.Color(247, 234, 42);
    private Color gray_black =  new java.awt.Color(100, 106, 107);

    public MenuListener(JPanel top, JPanel mid, JPanel bottom, JLabel heading, JCheckBox is_homo) {
        this.top = top;
        this.mid = mid;
        this.bottom = bottom;
        this.heading = heading;
        this.is_homo = is_homo;
    }

    @Override
    public String toString() {
        return "MenuListener{" +
                "top=" + top +
                ", mid=" + mid +
                ", bottom=" + bottom +
                '}';
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Exit":
                System.exit(0);
                break;
            case "Mint green":
                top.setBackground       (mint_green);
                mid.setBackground       (mint_green);
                bottom.setBackground    (mint_green);
                heading.setBackground   (mint_green);
                is_homo.setBackground   (mint_green);
                break;
            case "Yellow":
                top.setBackground       (gret_yellow);
                mid.setBackground       (gret_yellow);
                bottom.setBackground    (gret_yellow);
                heading.setBackground   (gret_yellow);
                is_homo.setBackground   (gret_yellow);
                break;
            case "Gray black":
                top.setBackground       (gray_black);
                mid.setBackground       (gray_black);
                bottom.setBackground    (gray_black);
                heading.setBackground   (gray_black);
                is_homo.setBackground   (gray_black);

                heading.setForeground(Color.WHITE);
                is_homo.setForeground(Color.WHITE);
                mid.getComponent(0).setForeground(Color.WHITE);
                mid.getComponent(2).setForeground(Color.WHITE);
                mid.getComponent(4).setForeground(Color.WHITE);
                break;
            case "Color picker":
                System.out.println("launch color picker");
                break;
            case "Include alpha channel in color?":
                System.out.println("checkbox is clicked...");
                break;
            default: break;
        }
    }
}
