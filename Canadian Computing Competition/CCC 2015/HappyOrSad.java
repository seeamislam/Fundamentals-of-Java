import java.util.Scanner;

public class HappyOrSad
{
   public static void main (String[] args) 
   {
   
Scanner input = new Scanner(System.in);
String text = input.nextLine();
     
int happy = 0, sad = 0;
int i;
      
for( i =0; i < text.length(); i++){                                     
if(text.charAt(i) == ')'){
happy++; }
         }
         
for( i =0; i < text.length(); i++){
if(text.charAt(i) == '('){
sad++;}          
      } 
      
if (happy == sad){
System.out.println("unsure");
      
}
     
else if (happy > sad){
System.out.println("happy");
     
}
else if (sad > happy){
System.out.println("sad");
}
}             
}