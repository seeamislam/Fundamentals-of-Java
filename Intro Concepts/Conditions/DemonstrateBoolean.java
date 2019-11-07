
public class DemonstrateBoolean
{
  public static void main (String[] args)
  {
  
System.out.println("-5 == 7 is " + (-5 == 7));
System.out.println("7 == 7 is " + (7 == 7));
System.out.println("5 <= 7 is " + (5 <= 7));
System.out.println("7 <= 5 is " + (7 <= 5));
System.out.println("-5 < 7 is " + (-5 < 7));
System.out.println("8 < 7 is " + (8 < 7));
System.out.println("-5 >= 7 is " + (-5 >= 7));
System.out.println("15 >= 7 is " + (15 >= 7));
System.out.println("15 > 7 is " + (15 > 7));
System.out.println("-5 > -7 is " + (-5 > -7));
System.out.println("-5 > 7 is " + (-5 > 7));
System.out.println("7 < 7 is " + (7 < 7));
System.out.println("-5 > -5 is " + (-5 > -5));
System.out.println("-5 != 7 is " + (-5 != 7));
System.out.println("-5 != -5 is " + (-5 != -5));
System.out.println("-5 != -(-5) is " + (-5 != -(-5)));
System.out.println("!(8 == 8 is " + (!(8 == 8)));
System.out.println("!(8 == 9) is " + (!(8 == 9)));
System.out.println(" (\"hello\").equals(\"hello\") " + ("hello".equals("hello")));
System.out.println(" (\"hello\").equals(\"goodbye\") " + ("hello".equals("goodbye")));
System.out.println(" (!\"hello\").equals(\"goodbye\") " + (!("hello".equals("goodbye"))));
System.out.println(" (!\"goodbye\").equals\"goodbye\") " + (!("goodbye".equals("goodbye"))));

}
}