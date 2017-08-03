import java.util.Scanner;
public class TemperatureConvert
{
  public static void main (String[] args)
  {
  double celsius; 
  double fahrenheit;
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter a temperature in Celcius");
  celsius = input.nextInt();
  
  fahrenheit = ((celsius * 9) / 5) + 32; 
  System.out.println(celsius + " degrees Celsius equals " + fahrenheit + " degrees Fahrenheit");
}
}