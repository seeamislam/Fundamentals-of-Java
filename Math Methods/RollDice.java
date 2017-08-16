//**********************************************************
// Assignment: RollDice
//
// Description: (Simulates the roll of 5 die.
//
// Author: Seeam Islam
//
// Date Start: N/A
// Date Completed: N/A
//
// Completion time: 1 hr)
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************

public class RollDice {
    public static void main (String[] args)
{
int roll1;
int roll2;
int sum;
double avgSum = 0;


roll1 = (int)(Math.random()*6) + 1;
roll2 = (int)(Math.random()*6) + 1;
sum = roll1 + roll2;
System.out.println("Die 1    Die 2     Sum");
System.out.println(" " + roll1 + "         " + roll2 + "        " + sum);

avgSum += sum;

roll1 = (int)(Math.random()*6) + 1; 
roll2 = (int)(Math.random()*6) + 1;
sum = roll1 + roll2;
System.out.println(" " +roll1 + "         " + roll2 + "        " + sum);

avgSum += sum;

roll1 = (int)(Math.random()*6) + 1; 
roll2 = (int)(Math.random()*6) + 1;
sum = roll1 + roll2;
System.out.println(" " +roll1 + "         " + roll2 + "        " + sum);

avgSum += sum;

roll1 = (int)(Math.random()*6) + 1; 
roll2 = (int)(Math.random()*6) + 1;
sum = roll1 + roll2;
System.out.println(" " +roll1 + "         " + roll2 + "        " + sum);

avgSum += sum;

roll1 = (int)(Math.random()*6) + 1; 
roll2 = (int)(Math.random()*6) + 1;
sum = roll1 + roll2;
System.out.println(" " +roll1 + "         " + roll2 + "        " + sum);

avgSum += sum;

System.out.println("The average sum: " + avgSum/5);
}
}