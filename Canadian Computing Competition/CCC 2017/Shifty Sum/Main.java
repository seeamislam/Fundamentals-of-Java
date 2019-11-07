import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
int total = 0;
Scanner input = new Scanner(System.in);
int numOne = input.nextInt();

int numTwo = input.nextInt();

for(int i = 1 ; i <= numTwo ; i++){
      total +=numOne*Math.pow(10,i);
}
System.out.println(total + numOne);
  }
}