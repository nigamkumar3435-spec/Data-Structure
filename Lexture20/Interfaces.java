package Lexture20;

interface Payment{
    void pay(double amount); //abstract method(all payment types must implement it)
}
//UPI Payment
class UpiPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs"+amount+" using UPI");
    }
}

//Credit card payment
class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payed Rs"+amount+" using CreditCard");
    }
}

//Main class
public class Interfaces {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CreditCardPayment();
        p1.pay(100);
        p2.pay(1000);
    }
}
