import java.util.*;
class CreateCloneClear {
  public static void main (String[] arg)
  {
    // creating a hash table
    Hashtable<Integer, String> table = new Hashtable<Integer, String>();

    Hashtable<Integer, String> table2 = new Hashtable<Integer, String>();

    // The key will be an int, and the value will be a string

    table.put(3, "Geeks");
    table.put(2, "forGeeks");
    table.put(1, "isBest");

    // create a clone or shallow copy of the first hashtable

    table2 = (Hashtable<Integer, String>)table.clone();

    System.out.println("values in clone: " + table2);

    // clear the first hashtable
    table.clear();

    System.out.println("after clearing: " + table);


  }
}