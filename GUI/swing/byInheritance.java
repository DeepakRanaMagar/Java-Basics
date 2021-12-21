import java.io.IOException;

import javax.swing.*;
public class byInheritance extends JFrame{
    JFrame f ;
    public byInheritance(){
        //Creating a button
        JButton b = new JButton("CLICK ME!");
        b.setBounds(130, 100, 100, 40);
        add(b);
        //Setting the frame size
        setSize(400,500);

        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) throws IOException{
        new byInheritance();
    }
}
