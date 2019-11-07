public class SequentialProgramming
{
public static void main (String[] args)
{
String user; // customer's name
double price; // product price
String product; // product name
final double tax; // HST rate
double productTax; // HST for product
double finalValue; // final price


user = "Mr. Bozz";
price = 400;
product = "Apple Watch";
tax = 0.13;
productTax = price * tax;
finalValue = price + productTax;

System.out.println("Customer's Name: " + user);
System.out.println("Item Purchased: " + product + "\n");
System.out.println("$" + price + " price");
System.out.println("$" + productTax + " HST");
System.out.println("----------");
System.out.println("$" + finalValue + " Total");

}
}