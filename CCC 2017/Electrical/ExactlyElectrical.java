import java.util.Scanner;
public class ExactlyElectrical
{
  public static void main (String[] args)
  {
Scanner input = new Scanner(System.in);
int x1 = input.nextInt();
int y1 = input.nextInt();
int x2 = input.nextInt();
int y2 = input.nextInt();
int num = input.nextInt();

int run = Math.abs(x2 - x1);
int rise = Math.abs(y2 - y1);
int distance = rise + run;

if (distance == num)
{
System.out.println("N");
}
else 
{
System.out.println("Y");
}


 

  }
}