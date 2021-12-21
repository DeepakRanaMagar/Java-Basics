
import java.awt.*;

class GUI{
    //Constructor declaration
    public GUI(){
        Frame f = new Frame("Software");
        f.setSize(500,400); //(width, height)

        TextField t = new TextField("Name");
        t.setBounds(200,50,30,15); //(x-coordinate, y-coordinate, width, height)

        Button b = new Button("Add");
        b.setBounds(200,150,20,2    5);

        f.add(t);
        f.add(b);
        f.setVisible(true);
        f.setLayout(null);
    }

public static void main(String[] args) {
    new GUI();
}
}
