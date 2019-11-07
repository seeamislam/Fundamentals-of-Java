//**********************************************************
// Assignment: J4A7
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
public class ChingStudent
{
  public static void main (String[] args)
  {
  
String name;
String schoolName;  

System.out.println("Enter your name");
Scanner input = new Scanner(System.in);
name = input.nextLine(); 

System.out.println("Enter the name of your school");
schoolName = input.nextLine(); 

if (schoolName.equals("Chinguacousy")) 
{
System.out.println(name + "! You should be in class!");
}
else 
{
System.out.println("Welcome to Chinguacousy " + name + "!");
}
  }
}