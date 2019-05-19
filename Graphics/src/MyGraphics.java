import javax.swing.*;
import java.awt.*;

public class MyGraphics extends JFrame {
    MyGraphics() {
        super("Graphics Canvas");
        setBounds(600, 400, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 100, 200, 200);
    }

}