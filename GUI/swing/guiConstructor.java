import javax.swing.*;
public class guiConstructor {
    //Creating a frame
    JFrame f;
    //Creating a constructor
    public guiConstructor(){
        f = new JFrame("USING CONSTRUCTOR");
        f.setSize(400, 500);
        //Creating a button
        JButton b = new JButton("CLICK HERE!");
        b.setBounds(130, 100,100, 100);
        //Adding button in the frame
        f.add(b);

        f.setVisible(true);
        f.setLayout(null);
    }
public static void main(String[] args) {
    new guiConstructor();
}
}
