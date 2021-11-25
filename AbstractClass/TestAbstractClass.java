//Declaration of abstract class
abstract class Bank{
    //Declaration of ABSTRACT FUNCTION
    abstract int interest();
}

//Inherited class1
class NicAsia extends Bank{
     int interest(){
         return 7;
        }
    }
    
    //Inherited class2
    class Nabil extends Bank{
        int interest(){
            return 5;
        }
    }
    
    //Main class
    
    class TestAbstractClass{
        public static void main(String[] args) {
            NicAsia na = new NicAsia();
            System.out.println("The Interest Rate of NIC ASIA BANK IS: "+na.interest());
            Nabil n = new Nabil();
            System.out.println("The Interest Rate of NABIL BANK IS: "+n.interest());
            
            
    }
}
