import javax.swing.*;

public class FirstSwing{
    public static void main(String[] args){
        //Create the Frame which includes everything
        JFrame f = new JFrame();
        //Setting the size of frame
        f.setSize(400, 500);
        //Creating a button 
        JButton b = new JButton("CLICK HERE!");
        b.setBounds(130,350,250,50);
        //Adding the button to the frame
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);
    }
}
