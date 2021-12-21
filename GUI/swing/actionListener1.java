import java.awt.event.*;
import javax.swing.*;
public class actionListener1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Action Listener");
        f.setSize(400,500);
        //final keyword le override garna dinna
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        tf.setEditable(false);
        JButton b = new JButton("Click Here!");
        b.setBounds(50, 100, 200, 30);
        
        //Adding ActionListener to button
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("FUCK YOU!");
            }
        });

        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setVisible(true);
    }    
}
