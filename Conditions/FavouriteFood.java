//**********************************************************
// Assignment: J4A6
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 7 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class FavouriteFood
{
  public static void main (String[] args)
  {
  
String favFood;  

System.out.println("Enter your favourite food");
Scanner input = new Scanner(System.in);
favFood = input.nextLine(); 

if (favFood.equals("pizza")) 
{
System.out.println("I like pizza too");
}
else 
{
System.out.println("I hate " + favFood);
}
  }
}