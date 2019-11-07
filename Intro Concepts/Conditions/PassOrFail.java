import java.util.Scanner;
public class PassOrFail
{
  public static void main (String[] args)
  {
Double inputtedValue;  
  
System.out.println("Enter's your mark in percentage");
Scanner input = new Scanner(System.in);
inputtedValue = input.nextDouble();  

if (inputtedValue >= 50) 
{
System.out.println("PASS");
}
else 
{
System.out.println("FAIL");
}

  }
}