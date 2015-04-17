import javax.swing.*;
import java.awt.*;

/**
 * Created by ZHRMoe on 15/4/15.
 */
public class Exercise12_1 extends JFrame {

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");
    JButton btn5 = new JButton("Button5");
    JButton btn6 = new JButton("Button6");

    public Exercise12_1()  {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(650, 60);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        this.add(panel1);
        this.add(panel2);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise12_1();
    }
}
