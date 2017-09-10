//**********************************************************
// Assignment: J5A5
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
public class GuessingGame
{
  public static void main (String[] args)
  {

double num;
int value; 
int inputted;
String again; 
int counter = 0; 

do {
num = Math.round(Math.random()*100);
System.out.println("Enter a number");
do
{
Scanner input = new Scanner(System.in);
inputted = input.nextInt();
double diff = inputted - num;

if (inputted > 0 && inputted < 100)
{

if (diff >= -10 && diff < 0)
{
System.out.println("Low, but close!");
}
else if (inputted < num)
{
System.out.println("Too low");
}
else if (diff <= 10 && diff > 0)
{
System.out.println("High, but close!");
}
else if (inputted > num)
{
System.out.println("Too high");
}
else 
{
System.out.println("You got it!");
}

counter += 1;
}

else
{
System.out.println("Number not within 1 and 100");
}

}

while (num != inputted);
System.out.println("Good job! The number was " + num);
System.out.println("Number of Guesses: " + counter);

System.out.println("Do you want to play again? Type yes to continue");
Scanner input = new Scanner(System.in);
again = input.nextLine();
}
while (again.equalsIgnoreCase("yes"));

System.out.println("Thanks for playing!");
}
} 