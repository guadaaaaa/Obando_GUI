package FoodOrderSystem;
import javax.swing.*;

public class FOSYSTEM extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cBurger;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JTextField tfQP;
    private JTextField tfQB;
    private JTextField tfQF;
    private JTextField tfQSD;
    private JTextField tfQT;
    private JTextField tfQS;
    private JPanel Jpanel;

    public FOSYSTEM(){
        btnOrder.addActionListener(e->{
            double total = 0;
            int q;
            if(cPizza.isSelected()){
                if(tfQP.getText().equals("") || tfQP.getText().equals("1")){
                    total+=100;
                } else {
                    q = Integer.parseInt(tfQP.getText());
                    total += q*100;
                }
            }
            if(cBurger.isSelected()){
                if(tfQB.getText().equals("") || tfQB.getText().equals("1")){
                    total+=80;
                } else {
                    q = Integer.parseInt(tfQB.getText());
                    total += q*80;
                }
            }
            if(cFries.isSelected()){
                if(tfQF.getText().equals("") || tfQF.getText().equals("1")){
                    total+=65;
                } else {
                    q = Integer.parseInt(tfQF.getText());
                    total += q*65;
                }
            }
            if(cSoftDrinks.isSelected()){
                if(tfQSD.getText().equals("") || tfQSD.getText().equals("1")){
                    total+=55;
                } else {
                    q = Integer.parseInt(tfQSD.getText());
                    total += q*55;
                }
            }
            if(cTea.isSelected()){
                if(tfQT.getText().equals("") || tfQT.getText().equals("1")){
                    total+=50;
                } else {
                    q = Integer.parseInt(tfQT.getText());
                    total += q*50;
                }
            }
            if(cSundae.isSelected() || tfQS.getText().equals("1")){
                if(tfQS.getText().equals("")){
                    total+=40;
                } else {
                    q = Integer.parseInt(tfQS.getText());
                    total += q*40;
                }
            }

            if(total == 0){
                JOptionPane.showMessageDialog(this, "Please Select an Option");
            }

            if(rbNone.isSelected()){
                JOptionPane.showMessageDialog(this,"The total price is Php " + total);
            } else if (rb5.isSelected()){
                double dis = total * 0.05;
                total -= dis;
                JOptionPane.showMessageDialog(this,"The total price is Php " + total);
            } else if (rb10.isSelected()) {
                double dis = total * 0.10;
                total -= dis;
                JOptionPane.showMessageDialog(this,"The total price is Php " + total);
            } else if (rb15.isSelected()){
                double dis = total * 0.15;
                total -= dis;
                JOptionPane.showMessageDialog(this,"The total price is Php " + total);
            }
        });
    }
    public static void main(String[] args) {
        FOSYSTEM app = new FOSYSTEM();
        app.setContentPane(app.Jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
