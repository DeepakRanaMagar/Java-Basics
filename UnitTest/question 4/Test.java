
import java.awt.event.*;

import javax.swing.*;


class GUI{
    JFrame f;
    JTextField t1,t2;
    JButton b;

    public GUI(){
        f=new JFrame();
        f.setSize(400,500);

        t1=new JTextField();
        t1.setBounds(250,50,100,15);

        t2=new JTextField();
        t2.setBounds(250,100,100,15);
        t2.setEditable(false);

        b=new JButton("get size");
        b.setBounds(250,200,30,15);

        f.setVisible(true);
        f.setLayout(null);

        f.add(t1);f.add(t2);f.add(b);

        b.addActionListener(new Example(t1,t2));
    }
}

class Example implements ActionListener{
    JTextField t1,t2;

    public Example(JTextField t1,JTextField t2){
        this.t1=t1;
        this.t2=t2;
    }
    public void actionPerformed(ActionEvent e) {
        int l= t1.getText().length();
        t2.setText(String.valueOf(l));
    }
}
class Test {
    public static void main(String[] args) {
        new GUI();
    }
}