public class Cricket extends Insect{ // add EXTENDS to inherit the methods of the parent class Insect

    double length; // initialize new attributes

    public Cricket(int age, double length) { // constructor for building crickets
        super(age, 6); // use SUPER keyword to build an initial insect using the insect class
        this.length = length; // add the new attribute for crickets to the object
    }

    public void says() {
        System.out.println("CHIRP");
    }

    public void jump() {
        System.out.println("A cricket jumped"); // we made a method unique to crickets.
    }


}
