// ArrayLists are part of the Collection Framework (which includes Arrays, Vectors, and Hashtables)
// A collection is a group of individual objects represented as a single unit
// ArrayLists provide us with dynamic arrays and can be helpful where lots of manipulation is needed.

// The difference between ArrayLists and Vectors are that Vectors are synchronized, while ArrayLists are not.

import java.util.*;
import java.io.*; 
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) throws IOException {

    int n = 5;
    // Declare an arraylist with an initial size of 5
    ArrayList <Integer> arrli = new ArrayList<Integer>(n);

    //Appending the new element at the end of the list
    for (int i = 1; i <= n; i++) {
      arrli.add(i);
    }

    // print the elements
    System.out.println(arrli);

    // Remove element at index 3
    arrli.remove(3);
    System.out.println(arrli);
  }
}