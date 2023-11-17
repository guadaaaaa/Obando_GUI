package LeapYear;
import javax.swing.*;

public class Leap extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel Jpanel;

    public Leap(){
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                JOptionPane.showMessageDialog(this, "Leap year");
            } else {
                JOptionPane.showMessageDialog(this,"Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        Leap app = new Leap();
        app.setContentPane(app.Jpanel);
        app.setSize(400,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
