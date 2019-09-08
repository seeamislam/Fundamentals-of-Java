public class Contractor extends Employee{ // inherit the properties of the parent class

    private int workingHours; // the working hours are not fixed for contractors

    public Contractor(String name, int paymentPerHour, int workingHours) { // constructor that builds contracter objects
        super(name, paymentPerHour); // to call a method defined in the parent class, we use super(). We are retrieving the name and wage
        this.workingHours = workingHours; // retrieve the number of hours
    }

    @Override // overriding allows a subclass to provide a specific implementation of a method that is already provided by one of its parent classes
    // in this case, we are making a new implementation of the calculateSalary method (it was abstract before, so we can).
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
