//**********************************************************
// Assignment: J5A3
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 19 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class MoreUsingFor
{
  public static void main (String[] args)
  {
int i;
double number1 = 0;
double number2 = 0;
double number3 = 0;
double number4 = 0;
double number5 = 0;
double sum = 0;
double larNum;
double smallNum;
double average;

System.out.println("Enter 5 numbers");
Scanner input = new Scanner(System.in);

for (i = 0; i < 5; i++)
{
if (i == 0)
{
number1 = input.nextInt();
sum+=number1;
}
else if (i == 1)
{
number2 = input.nextInt();
sum+=number2;
}
else if (i == 2)
{
number3 = input.nextInt();
sum+=number3;
}
else if (i == 3)
{
number4 = input.nextInt();
sum+=number4;
}
else if (i == 4)
{
number5 = input.nextInt();
sum+=number5;
}
}
average = sum/5;
System.out.println("The average of all the numbers; " + average);

larNum = Math.max(number1, number2);
larNum = Math.max(larNum, number3);
larNum = Math.max(larNum, number4);
larNum = Math.max(larNum, number5);

smallNum = Math.min(number1, number2);
smallNum = Math.min(smallNum, number3);
smallNum = Math.min(smallNum, number4);
smallNum = Math.min(smallNum, number5);

System.out.println("The largest number is: " + larNum);
System.out.println("The smallest number is: " + smallNum);

}
}