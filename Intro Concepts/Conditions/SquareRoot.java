//**********************************************************
// Assignment: J4A4
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 5 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class SquareRoot
{
  public static void main (String[] args)
  {
Double inputtedValue;  
  
System.out.println("Enter a decimal number");
Scanner input = new Scanner(System.in);
inputtedValue = input.nextDouble();  

if (inputtedValue >= 0) 
{
System.out.println("The square root of " + inputtedValue + " is " + (Math.sqrt(inputtedValue)));
}
else 
{
System.out.println("Negative numbers do not have a square root value");
}

  }
}