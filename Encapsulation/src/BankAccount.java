public class BankAccount {
    // the attributes for each BankAccount (object) will have to be private so it is not accessible by other classes

    private int account_number;
    private int account_balance; // private variables because you want to keep this information concealed.
    // to use these values, we have getter and setter public methods inside this class

    //contructor to build instances

    public BankAccount(int account_number, int account_balance) {
        this.account_number = account_number;
        this.account_balance = account_balance;
        System.out.println("You created account " + this.account_number + ".");
    }

}
