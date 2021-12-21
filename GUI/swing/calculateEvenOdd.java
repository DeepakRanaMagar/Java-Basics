import javax.swing.*;   
import java.awt.event.*;
public class calculateEvenOdd {
    public static void main(String[] args) {
    JFrame f = new JFrame("Find EVEN or ODD");
    f.setSize(400,500);

    //Creating two textfield
    JTextField t1 = new JTextField("Enter Any Number");
    t1.setBounds(50,50,150,20);
    JTextField t2 = new JTextField("RESULT");
    t2.setBounds(50,100,150,20);
    t2.setEditable(false);
    //Creating a button which to be clicked in order to show the result
    JButton b = new JButton("Find");
    b.setBounds(50,150,95,30);

    //Adding the action Listener
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int n = Integer.parseInt(t1.getText());
            if(n%2 ==0){
                t2.setText("EVEN");
            }else{
                t2.setText("ODD");
            }
        }
    });
    //adding to the frame
    f.add(t1);
    f.add(t2);
    f.add(b);
    f.setLayout(null);
    f.setVisible(true);
}
}