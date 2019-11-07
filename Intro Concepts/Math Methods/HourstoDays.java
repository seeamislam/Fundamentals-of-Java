import java.util.Scanner;
public class HourstoDays {
    public static void main (String[] args) {
    
    System.out.println("Enter a number of hours");
    Scanner input = new Scanner(System.in);
    int days;
    int hours;
    int time;
    
    time = input.nextInt();
    days = time / 24;
    hours = time % 24;
    
    System.out.println("The number of days " + days);
    System.out.println("The number of hours " + hours);
   }
}