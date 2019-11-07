import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) { // main method that is run

        // start creating instances (objects) of the BankAccount class

        BankAccount myBankAccount = new BankAccount(4141, 100); // created a bank account with an account num and balance
        // System.out.println(myBankAccount.account_balance); this has an error because account_balance is private. We can only access it using the methods we created

        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

        // Encapsulation can be known as data hiding, as we are hiding the attributes of the objects.
    }
}
