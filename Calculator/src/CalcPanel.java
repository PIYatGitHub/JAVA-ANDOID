import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalcPanel extends JPanel {
    private JPanel panel;
    private boolean start;
    private JButton display;
    private String lastCommand = "=";
    private double result = 0;
    CalcPanel() {
        super();

        start = true;

        setLayout(new BorderLayout());
        display= new JButton("0");
        display.setEnabled(false);

        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5,4));

        InsertAction insertAction = new InsertAction();
        CommandAction commandAction = new CommandAction();

        addBtn("7", insertAction);
        addBtn("8", insertAction);
        addBtn("9", insertAction);
        addBtn("/", commandAction);

        addBtn("4", insertAction);
        addBtn("5", insertAction);
        addBtn("6", insertAction);
        addBtn("*", commandAction);

        addBtn("1", insertAction);
        addBtn("2", insertAction);
        addBtn("3", insertAction);
        addBtn("-", commandAction);

        addBtn("0", insertAction);
        addBtn(".", insertAction);
        addBtn("=", commandAction);
        addBtn("+",commandAction);

        addBtn("sqrt", commandAction);
        addBtn("negate", commandAction);
        addBtn("x^2", commandAction);
        addBtn("no dec.", commandAction);

        add(panel, BorderLayout.CENTER);
    }

    private void addBtn(String label, ActionListener listener){
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if(start) {
                display.setText("");
                start = false;
            }
            if(!input.equals(".")|| !display.getText().contains("."))
                display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(start) {
                calc(Double.parseDouble(display.getText()));
                lastCommand = command;
            } else {
                calc(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }

        }
    }

    @org.jetbrains.annotations.Contract(pure = true)
    private  void calc (double num) {
        if (lastCommand.equals("+")) result +=num;
        if (lastCommand.equals("-")) result -=num;
        if (lastCommand.equals("*")) result *=num;
        if (lastCommand.equals("/") && num !=0 ) result /= num;
        if (lastCommand.equals("sqrt")) result = Math.sqrt(num);
        if (lastCommand.equals("negate")) result *= -1;
        if (lastCommand.equals("x^2")) result += Math.pow(num, 2);
        if (lastCommand.equals("no dec.")) result = (int) result;
        if (lastCommand.equals("=")) result = num;

        display.setText("" + result);
    }

}
