import java.util.Scanner;
public class MinutestoDaysAndHours {
    public static void main (String[] args) {
    
    System.out.println("Enter a number of minutes");
    Scanner input = new Scanner(System.in);
    int days;
    int hours;
    int minutes;
    int remainingMins;
    
    minutes = input.nextInt();
    
    days = minutes / 1440;
    hours = (minutes%1440) / 60;
    remainingMins = ((minutes%1440)%60);
    
    System.out.println("The total number of minutes: " + minutes);    
    System.out.println("The number of days: " + days);
    System.out.println("The number of hours: " + hours);
    System.out.println("The number of minutes: " + remainingMins);
   }
}