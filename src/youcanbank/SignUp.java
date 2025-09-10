import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SignUp extends JFrame {
    SignUp(){
        Border border=BorderFactory.createLineBorder(Color.gray,3);
        JLabel label1=new JLabel("Welcome To");
        JLabel label2=new JLabel("You can Bank");
        label1.setForeground(Color.black);
        label2.setForeground(Color.black);
        label1.setFont(new Font("Dialogo",Font.BOLD,20));
        label1.setFont(new Font("Dialogo",Font.BOLD,20));

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(400,600));
        panel.setBorder(border);
        JLabel label3=new JLabel("SignUp");
        label3.setFont(new Font("Dialogo",Font.BOLD,18));
        panel.add(label3);
        JLabel label4=new JLabel("Unlock your savings plan");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(label1);
        this.add(label2);
        this.add(label4);
        this.add(panel);
    }
}
