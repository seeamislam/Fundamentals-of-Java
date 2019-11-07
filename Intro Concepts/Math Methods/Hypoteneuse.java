import java.util.Scanner;
public class Hypoteneuse {
    public static void main (String[] args)
{
double height;
double base;
double hypoteneuse;

Scanner input = new Scanner(System.in);
System.out.println("Enter the height of a right triangle");
height = input.nextDouble();

System.out.println("Enter the base of the right triangle");
base = input.nextDouble();

hypoteneuse = Math.sqrt((Math.pow(height,2) + Math.pow(base,2)));
System.out.println(hypoteneuse);
}
}