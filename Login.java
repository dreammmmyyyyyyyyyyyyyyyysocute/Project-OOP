import javax.swing.*;
import java.awt.*;
//all of URL for shop logo
//import java.net.URL;
public class Login {
    private JFrame fr;
    private JPanel pn1, pn2, pn3, pn4;
    private JButton bt1, bt2;
    private JLabel lb;
    public Login(){
        ImageIcon icon = null;
        fr = new JFrame("Ya Luem Khuen");
        //URL imageURL = Login.class.getResource("images/12.jpg");
        //if (imageURL != null){
           // icon = new ImageIcon(imageURL);
        //}
        lb = new JLabel(icon);
        //lb.setToolTipText("A label containing only an image");
        pn1 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        bt1 = new JButton("Customer");
        bt2 = new JButton("     Staff     ");
        pn1.setLayout(new FlowLayout());
        pn1.add(pn3);
        pn1.add(bt1);
        pn2 = new JPanel();
        pn2.setLayout(new FlowLayout());
        pn2.add(pn4);
        pn2.add(bt2);
        fr.setLayout(new GridLayout(3, 1));
        fr.add(lb); fr.add(pn1); fr.add(pn2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 200);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        Login obj = new Login();
 }
}
