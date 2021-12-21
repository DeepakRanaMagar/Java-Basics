abstract class Button{
    abstract double add();

    abstract double sub();
}

class Addition extends Button{
    double a,b;

    //creating a constructor
    public Addition(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double add(){
        return a+b;
    }
    public double sub(){
        return 0;
    };
}

class Subtraction extends Button{
    double a,b;

    public Subtraction(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double add(){
        return 0;
    }
    public double sub(){
        return a-b;
    };
}

public class Calculate{
    public static void main(String[] args) {
        Addition a = new Addition(1, 2);
        System.out.println("Result: "+a.add());

        Subtraction s = new Subtraction(2, 1);
        System.out.println("Result: "+s.sub());
    }
}