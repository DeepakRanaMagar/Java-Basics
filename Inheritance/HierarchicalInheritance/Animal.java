package HierarchicalInheritance;

public class Animal {
    void eat(){
        System.out.println("Eating");
    }
    
}

class Cow extends Animal{
    void grass(){
        System.out.println("Cow eats Grass.");
    }
}

class Lion extends Animal{
    void meat(){
        System.out.println("Lion eats meat.");
    }
}

class TestHierarchical{
    public static void main(String[] args){
        Lion l = new Lion();
        Cow c = new Cow();
        l.meat();
        c.grass();
    }
}