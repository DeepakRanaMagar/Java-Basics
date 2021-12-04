public class JavaExceptionExample{
    public static void main(String[] args) {
        //try keyword

        try{
            //Exception raising code
            int data = 100/0;
        }catch(ArithmeticException e ){
            System.out.println(e);
        }

        //rest code
        System.out.println("rest of code");
    }
}