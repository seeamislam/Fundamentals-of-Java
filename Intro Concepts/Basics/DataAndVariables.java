//**********************************************************
// Assignment: J2A6
//
// Description: Data Types
// Author: Seeam Islam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 1
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************

public class DataAndVariables
{
    public static void main (String[] args)
    {
  
    int numberA;
    int numberB;
    int sum;
    int difference;
    int product; 
    int quotient; 
    int modulus; 

    numberA = 12;
    numberB = 9;

    sum = numberA + numberB;
    difference = numberA - numberB;
    product = numberA * numberB;
    quotient = numberA / numberB;
    modulus = numberA%numberB;

    System.out.println ("the sum of " + numberA + " plus " + numberB + " is " + sum);
    System.out.println ("the difference of " + numberA + " minus " + numberB + " is " + difference);
    System.out.println ("the product of " + numberA + " times " + numberB + " is " + product);
    System.out.println ("the quotient of " + numberA + " divide " + numberB + " is " + quotient);
    System.out.println ("the remainder of " + numberA + " modulus " + numberB + " is " + modulus);
    } 
} 