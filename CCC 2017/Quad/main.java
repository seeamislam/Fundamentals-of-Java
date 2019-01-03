import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
Scanner input = new Scanner(System.in);
String numOne = input.nextLine();

String numTwo = input.nextLine();

if (numOne.charAt(0) == '-' && numTwo.charAt(0) == '-')
{
System.out.println("3");
}
else if (numOne.charAt(0) == '-' && numTwo.charAt(0) != '-')
{
System.out.println("2");
}
else if (numOne.charAt(0) != '-' && numTwo.charAt(0) != '-')
{
System.out.println("1");
}
else {
System.out.println("4");
}

 

  }
}