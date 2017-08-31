//**********************************************************
// Assignment: J4A5
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 8 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class Discriminant

{
  public static void main (String[] args)
  {
Double aValue;
Double bValue;
Double cValue; 
Double discriminant;
  
System.out.println("Enter an A value");
Scanner input = new Scanner(System.in);
aValue = input.nextDouble(); 

System.out.println("Enter a B value");
bValue = input.nextDouble(); 

System.out.println("Enter a C value");
cValue = input.nextDouble(); 

discriminant = Math.pow(bValue,2) - 4 * aValue * cValue;

if (discriminant == 0) 
{
System.out.println("There is one root");
}
else if (discriminant > 0)
{
System.out.println("There are 2 roots");
}
else
{
System.out.println("There are no real roots");
}
}

  }