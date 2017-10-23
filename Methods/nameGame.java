import java.util.Scanner;
class nameGame
 { 
   public static void main ( String[] args )
   {
   System.out.println(greeting("Jaspreet"));
   System.out.println(greeting("Avneet"));
   System.out.println(greeting("X"));
   
   System.out.println("Enter a number");
   Scanner input = new Scanner(System.in);
   int num = input.nextInt();
   System.out.println(nearTen(num));
   }
   
   public static String greeting (String name)
   {
   return "Greetings " + name;
   }
   
    public static boolean nearTen(int num)
   {
   int remainder = num % 10;
   
   if (remainder <= 2 || remainder >= 8)
   {
   return true;
   }
   else
   {
   return false;
   }
   }
}