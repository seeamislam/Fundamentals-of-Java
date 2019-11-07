public abstract class Employee { // abstract keyword makes this an abstract class, meaning we can have abstract methods AND concrete methods.
    // note: this abstract class can therefore not instantiate any objects, and so, its child classes have to.

    private String name;
    private int paymentPerHour;

    // constructor method to build objects later
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary(); // create an abstract method, which has no definition here. We must define it within each subclass.

    public String getName() { // creating other, non-abstract methods
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

}
