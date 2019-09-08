public class FullTimeEmployee extends Employee { // inherit the methods and attributes of the parent class

    public FullTimeEmployee (String name, int paymentPerHour) { // make a constructor for FullTimeEmployee objects
        super(name, paymentPerHour); // run the method in the parent class which retrieves name and paymentperhour
    }

    @Override // we want to override this method that was made in the parent class
    public int calculateSalary() {
        return getPaymentPerHour() * 8; // getPaymentPerHour is a method defined in the parent class which this class inherited. It simply retrieves the hourly wage.
    }
}
