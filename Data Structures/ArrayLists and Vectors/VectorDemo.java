// Vectors implement dynamic arrays (a growing array of objects). They are useful when you don't know the size of an array ahead of time.

import java.util.*;

public class VectorDemo {
  public static void main(String args[]) {
    // Runs the default vector contructor (to make an instant of the vector class)
    Vector v = new Vector(3, 2);
    // Create a new vector with a size of 3, but increments by 2 sizes each time that it is resized upwards. 

    // Size is the number of items currently in the vector
    // Capacity is how many items the vector can fit
    System.out.println("Initial size: " + v.size()); // # of elements inside vector
    System.out.println("Initial Capacity: " + v.capacity()); // 3

    // Insert an element at a specified position:
    Vector test = new Vector(); // this automatically makes a vector with a capacity of 10
    test.add(1); // Insert a 1 to the end of the vector

    // first argument specifies which index to insert.
    test.add(1, 2);
    test.add(2, "geeks");
    test.add(3, "forGeeks");
    System.out.println("Vector is " + test);

    test.clear(); // Clears all elements within the vector object
    // .clear() is a method you apply on the vector object (instant of the vector class)

  }
}