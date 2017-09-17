import java.util.Scanner;
public class LastNameFirst
{
   public static void main (String[] args)
   {
      String name;
      System.out.println("Enter your name");
      Scanner input = new Scanner(System.in);
      name = input.nextLine();
      int space = name.indexOf(" ");
      
      String lastName = (name.substring(space));
      String firstName = (name.substring(0,space));
   
      System.out.print(lastName.toUpperCase());
      System.out.println(" " + firstName.toLowerCase());
   }
}