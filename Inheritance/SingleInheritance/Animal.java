package SingleInheritance;

//Parent class
public class Animal {
    void eat(){
        System.out.println("Eating");
    }
    
}

//Child class
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

//Test class
class TestInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}