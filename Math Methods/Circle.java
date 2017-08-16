import java.util.Scanner;
import java.text.DecimalFormat;
public class Circle
{
  public static void main (String[] args)
  {

double radius; 
double circum;
double area;
DecimalFormat value;

  
System.out.println("Enter a radius");
Scanner input = new Scanner(System.in);
radius = input.nextDouble();

value = new DecimalFormat("00.0000"); // rounds to 4th decimal place
area = Math.PI * Math.pow(radius,2);
circum = (2 * Math.PI * radius);

System.out.println("The area of the circle with this radius is " + value.format(area)+ " units");
System.out.println("The circumference of the circle with this radius is " + value.format(circum)+ " units");

  }
  }