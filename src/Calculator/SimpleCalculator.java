package Calculator;

import LeapYear.Leap;

import javax.management.StringValueExp;
import javax.swing.*;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel Jpanel;

    public SimpleCalculator() {
        btnCompute.addActionListener(e -> {
            if(tfNumber1.getText().equals("") || tfNumber2.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Fill in all REQUIRED Fields");
            }
            double n1,n2;
            try{
                n1 = Double.parseDouble(tfNumber1.getText());
                n2 = Double.parseDouble(tfNumber2.getText());
            } catch (Exception x){
                JOptionPane.showMessageDialog(this,"Input must be an Integer");
                return;
            }


            if(cbOperations.getSelectedIndex() == 1){
                lblResult.setText(String.valueOf(n1+n2));
            } else if(cbOperations.getSelectedIndex() == 2){
                lblResult.setText(String.valueOf(n1-n2));
            } else if(cbOperations.getSelectedIndex() == 3){
                lblResult.setText(String.valueOf(n1*n2));
            } else if(cbOperations.getSelectedIndex() == 4){
                if(n2!=0){
                    lblResult.setText(String.valueOf(n1/n2));
                } else {
                    JOptionPane.showMessageDialog(this,"Invalid Divisor input another");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.Jpanel);
        app.setSize(800,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }

}
