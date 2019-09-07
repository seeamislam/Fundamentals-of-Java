public class BankAccount {
    // the attributes for each BankAccount (object) will have to be private so it is not accessible by other classes

    private int account_number;
    private int account_balance; // private variables because you want to keep this information concealed.
    // to use these values, we have getter and setter public methods inside this class

    //contructor to build instances

    public BankAccount(int account_number, int account_balance) {
        this.account_number = account_number; // account number is saved to this.account_number
        this.account_balance = account_balance;
        System.out.println("You created account " + this.account_number + ".");
    }

    // now, we can build methods which help the objects (bank accounts) interact

    public void deposit(int addMoney) { // these methods are public (access modifiers) so any class can use them
        if (addMoney < 0) { // check that deposited money is not negative
            System.out.println("You cannot desposit a " + "negative amount.");
        }
        else {
            this.account_balance = this.account_balance + addMoney; // add the deposited money to the existing balance
            System.out.println("$" + addMoney + " " + "deposited into account " + this.account_number + ".");
        }

    }

    public void withdraw (int removeMoney) { // method to take money out of respective account

        if(removeMoney > this.account_balance) { // ensure you are not taking out more money than you actually have
            System.out.println("You cannot remove more " + "than what is in your account");
        }
        else{
            this.account_balance = this.account_balance - removeMoney;
            System.out.println("$" + removeMoney + " " + "has been withdrawn from account " + this.account_number + ".");
        }

    }

}
