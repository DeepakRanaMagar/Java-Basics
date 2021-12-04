import java.util.Scanner;

class Payment {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    Payment(double val) {
        this.amount = Math.round(val * 100) / 100.0;
    }

    
}

class DebitCardPayment extends Payment {
    String BankName, CvvNum;
    int CardNumber;

    public DebitCardPayment(double val, String BankName, String CvvNum, int CardNumber) {
        super(val);
        // this.CardName=CardName;
        this.BankName = BankName;
        this.CvvNum = CvvNum;
        this.CardNumber = CardNumber;
    }

    public void DebitPaymentDetails() {
        System.out.println("The Payment: " + this.amount + "\n Bank Name: " + this.BankName + "\n By the card number : "
                + this.CardNumber + "\n With CVV number: " + this.CvvNum);
    }

}

class PaypalSystem extends Payment {
    String email;
    String password;

    PaypalSystem(double val,String email, String password) {
        super(val);
        this.email = email;
        this.password = password;
    }

    public void PaypalPaymentDetails() {
        System.out.println("The payment of: " + this.amount + "\n Done by: " + this.email);
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter Your choice of Payment Gateway: \n 1.DEBIT CARD \n 2.Paypal");
        Scanner s= new Scanner(System.in);
        int choice=s.nextInt();

    
        switch(choice){
            case 1: 
                DebitCardPayment dd = new DebitCardPayment(1000, "NIC ATM", "NIC AISA", 888888888);
                dd.DebitPaymentDetails();
                break;
            
            case 2:         
                PaypalSystem pp = new PaypalSystem(1000, "abc@gmail.com", "qwerty");
                pp.PaypalPaymentDetails();
                break;
        }  
    }
}
