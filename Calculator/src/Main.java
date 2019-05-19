import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {
        JFrame calculator = new JFrame();

        calculator.setTitle("Java calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setBounds(200, 200, 400,320);

        CalcPanel panel = new CalcPanel();

        calculator.add(panel);
        calculator.setVisible(true);

    }
}
