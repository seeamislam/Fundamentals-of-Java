import java.util.Scanner;

public class SpecialDay
{
public static void main (String[] args)
{
System.out.println("Enter the month of the date");
Scanner monthAsk = new Scanner(System.in);
System.out.println("Enter the number of date");
Scanner dayAsk = new Scanner(System.in);

int  month = monthAsk.nextInt();
int day = dayAsk.nextInt();

if (month == 1)
{
   System.out.println("Before");
}
else if (month == 2);
{
   if (day < 18)
       {
   System.out.println("Before");
      }
   else if (day == 18)
   {
   System.out.println("Special");
   }
   else{
     System.out.println("After");
     }
}
}


}
