import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat(); // our dog and cat classes required no constructors, so they're just basic objects

        if (c instanceof Pet) { // if cat is an implementation of the Pet interface, then Play must be a method of the cat instance
            c.play();
        }

        if (d instanceof Pet) {
            d.play();
        }

        Pet p; // let's generate a random pet, it could be a cat or dog.
        Random rand = new Random(); // generating a random number from the random class
        int n = rand.nextInt(2); //making the bound 2 so it has to be a 0 or 1

        if (n==0) {
            p = new Dog();
        }
        else {
            p = new Cat();
        }

        p.play();
    }
}
