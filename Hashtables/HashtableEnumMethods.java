import java.util.*;
import java.util.Enumeration;

public class Main {
  public static void main(String args[])
  {
    //Create a HashTable
    Hashtable balance = new Hashtable();
    // Hashtable() is the default constructor and it instantiates the hashtable class (it makes an instance of it)
    Enumeration names;
    // the enumeration interface defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects - basically you can move through the elements in this
    String str;
    double bal;

    // fill the hashtable with values
    balance.put("Zara", new Double(3434.34));
    balance.put("Mahnaz", new Double(123.22));
    balance.put("Ayan", new Double(1378.00));
    balance.put("Daisy", new Double(99.22));
    balance.put("Qadir", new Double(-19.08));

    // Show all balances in hash table
    
    names = balance.keys(); // set the keys of the hashtable to name

    while(names.hasMoreElements()) {
      // hasMoreElements is a method that 'names' can use because it was enumerated. It returns true when there are still more elements left to extract. It returns false if there are not.
      str = (String) names.nextElement(); //Save the next key to str
      // nextElement is another enum method which returns the next object in the enum as an object reference
      System.out.println(str + ": " + balance.get(str));
      // print the key and the associated value with that key
    }
    System.out.println();

    // Deposit 1000 into Zara's account
    bal = ((Double)balance.get("Zara)")).doubleValue();
    balance.put("Zara", new Double(bal + 1000));
  }
}