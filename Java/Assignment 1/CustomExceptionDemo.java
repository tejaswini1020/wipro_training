class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(String message) {
super(message);
}
}

// Bank Account class
class BankAccount {
private double balance;
public BankAccount(double balance) {
this.balance = balance;
}
// Method to withdraw money
public void withdraw(double amount) throws InsufficientBalanceException {
if (amount > balance) {
throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
} else {
balance -= amount;
System.out.println("Withdrawal successful. Remaining balance: " + balance);
}
}
}
public class CustomExceptionDemo {
public static void main(String[] args) {
        // Bank Account example
BankAccount account = new BankAccount(500);
try {
account.withdraw(600); // This will throw an exception
} 
catch (InsufficientBalanceException e) {
System.out.println("Exception caught: " + e.getMessage());
}
}
}