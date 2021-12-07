import java.util.InputMismatchException;
import java.util.Scanner;
class Divison{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //TRY AND CATCH INITIALIZATION
        try{
            System.out.println("Enter a number: ");
            int a = s.nextInt();
            System.out.println("Enter next number: ");
            int b = s.nextInt();
            int ans = a/b;
            System.out.println("Answer: "+ans);
        }catch(ArithmeticException e){
            System.out.println("Can't Divide by 0!");
            //System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("ONLY NUMBERS CAN BE ENTERED!");
        }catch(Exception e){
            //System.out.println("Exe");
        }
    }
}