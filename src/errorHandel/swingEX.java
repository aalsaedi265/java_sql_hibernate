
package errorHandel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class swingEX {
    public static void main(String[] args){
        JFrame frame = new JFrame("Frist Java Graphic");
        frame.setSize(200,300);
        
        JLabel label = new JLabel("Fus RO Da");
        JTextField textField = new JTextField();

        JButton btn1 = new JButton("1.btn");
        JButton btn2 = new JButton("2.btn");
        JButton btn3 = new JButton("3.btn");

        JPanel panel = new JPanel();

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(label);
        panel.add(textField);

        frame.add(panel);
        frame.show();

    }
    
}
