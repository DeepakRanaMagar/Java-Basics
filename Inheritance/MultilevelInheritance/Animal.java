package MultilevelInheritance;

//Parentclass
public class Animal {
    void eat(){
        System.out.println("Cat ate a fish.");
    }
    
}

//Childclass
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows.");
    }

}

//Testclass
class TestMultilevel{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.meow();

        
    }
}
