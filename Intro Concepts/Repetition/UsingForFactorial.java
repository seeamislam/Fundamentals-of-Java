//**********************************************************
// Assignment: J5A4
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 18 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class UsingForFactorial
{
  public static void main (String[] args)
  {

int num;
int inputted;  
double finalAns = 1;
  
System.out.println("Enter a number");
Scanner input = new Scanner(System.in);
num = input.nextInt();


System.out.print(num + "! = ");

for (inputted = num; inputted > 1; inputted--)
{
System.out.print(inputted + " x ");
finalAns = finalAns*inputted;
}

System.out.print("1 = " + finalAns);

  }
}