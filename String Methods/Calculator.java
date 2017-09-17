//**********************************************************
// Assignment: J6A5
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 30 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class Calculator
{
   public static void main (String[] args)
   {
      String expression;
      double firstNum;
      double secondNum;
      double output;
      int operatorLength = 0;
      String operator;
      
      System.out.println("Enter your expression");
      Scanner input = new Scanner(System.in);
      expression = input.nextLine();
      
      for (int i = 1; i < expression.length(); i++)
      {
         if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/' || expression.charAt(i) == '^')
         {
            operatorLength = i;
            i = expression.length()+ 1;
         }
      
      }
      firstNum = Double.parseDouble(expression.substring(0,operatorLength).trim());
      secondNum = Double.parseDouble(expression.substring(operatorLength+1, expression.length()).trim());
      operator = expression.substring(operatorLength, operatorLength+1).trim();
      
      if (operator.equals("+"))
      {
         System.out.println(expression + " = " + (firstNum + secondNum));
      }
      
      else if (operator.equals("-"))
      {
         System.out.println(expression + " = " + (firstNum - secondNum));
      }
      
      else if (operator.equals("*"))
      {
         System.out.println(expression + " = " + (firstNum * secondNum));
      }
      
      else if (operator.equals("/"))
      {
         System.out.println(expression + " = " + (firstNum / secondNum));
      }
      
      else if (operator.equals("^"))
      {
         System.out.println(expression + " = " + (Math.pow(firstNum,secondNum)));      }
      }
      
}