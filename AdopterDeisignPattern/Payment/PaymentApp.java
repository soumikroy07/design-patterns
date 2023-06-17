package LLD.AdopterDeisignPattern.Payment;

public class PaymentApp {

    public static void main(String[] args) {
        PaymentAdapter adapter = new PaymentAdapter();
        PaymentProcessor payment = new PaymentProcessorImpl();

        if(payment.payInDollars(30) == adapter.convertIntoDollars(2400) ){
            System.out.println("Your Payment is successfully..!!");
        }else {
            System.out.println("Your Payment is not SuccessFull..!! Try again..");
        }
    }
}
