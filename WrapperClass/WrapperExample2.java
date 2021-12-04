public class WrapperExample2 {
    public static void main(String[] args) {
        
        //Create objects of wrapper class
        Integer obj1 = Integer.valueOf(5);
        Double  obj2 = Double.valueOf(6.969);

        //Converting wrapper class objects into primitive types
        int a =obj1.intValue();
        double b = obj2.doubleValue();

        System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);

    }
    
}
