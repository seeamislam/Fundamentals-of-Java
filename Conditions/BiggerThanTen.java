//**********************************************************
// Assignment: J4A3
//
// Description: Checks if you pass or fail)
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 4 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class BiggerThanTen
{
  public static void main (String[] args)
  {
Double inputtedValue;  
  
System.out.println("Enter a number that is greater than 10");
Scanner input = new Scanner(System.in);
inputtedValue = input.nextDouble();  

if (inputtedValue > 10) 
{
System.out.println("The End");
}
else 
{
System.out.println("Your number was not greater than 10!");
}

  }
}