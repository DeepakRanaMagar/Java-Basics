class WrapperExample1{
public static void main(String[] args) {
    
    //Creating Primitive data types
    int a=2;
    double b=3.69;

    //Converting into WRAPPER OBJECTS

    Integer obj1=Integer.valueOf(a);
    Double obj2= Double.valueOf(b);

    //Checking whether the generated objects are Integer or Double type or not.

    if(obj1 instanceof Integer){
        System.out.println("An Object of Integer is Created.");
    }

    if(obj2 instanceof Double){
        System.out.println("An Object of Double is created.");
    }
}
}