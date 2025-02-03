/*
Design an Online Payment System with an abstract class PaymentMethod containing an abstract method processPayment().
 Create two derived classes: CreditCard and PayPal, each implementing 
   the processPayment() method differently (for example, one might charge a fee, and the other might not). 
Create a method processTransaction(PaymentMethod paymentMethod) that accepts a PaymentMethod object and processes the payment by calling processPayment().
Demonstrate polymorphism by using both CreditCard and PayPal objects in the transaction processing system.
*/

abstract class PaymentMethod {
double amount;
PaymentMethod(double amount){
this.amount = amount;
}
public abstract void processPayment();
}

class CreditCard extends PaymentMethod{
static final double transcation_fee=0.2;
CreditCard(double amount){
super(amount);
}
public void processPayment(){
double total_amount = amount+(amount * transcation_fee);
System.out.println("Proceesed Payment using credit card : " +total_amount);
}
}

class PayPal extends PaymentMethod{
PayPal(double amount){
super(amount);
}
public void processPayment(){
System.out.println("Processed payment using Paypal : " + amount);
}
}

public class OnlinePayment{
static void processTransaction(PaymentMethod paymentMethod){
paymentMethod.processPayment();
}
public static void main(String[] args){
PaymentMethod cardpayment = new CreditCard(1000.0);
PaymentMethod palpayment = new PayPal(1000.0);
processTransaction(cardpayment);
processTransaction(palpayment);
}
}