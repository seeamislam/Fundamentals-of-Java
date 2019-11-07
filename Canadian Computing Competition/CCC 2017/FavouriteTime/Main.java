import java.util.Scanner;
import java.util.ArrayList;
public class Main{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int hrs = 12;
      int mins = 0;
      int count = 0;
      
      int stopTime = input.nextInt();
      
      String finalTime;
      for(int i = 0; i < stopTime; i++){
         mins++;
         if(mins >= 60){
            hrs++;
            hrs = hrs % 12;
            mins = 0;
         }
         String formatOne = "";
         String formatTwo = "";
         
          if(hrs < 10){
            formatTwo = "0";
           } 
        if(mins<10){
            formatOne = "0";
         }
         
         if(formatTwo.equals("0") && hrs == 0){
            finalTime = "12" + ":" + formatOne + mins;   
         }
         else{
            finalTime = formatTwo + hrs + ":" + formatOne + mins;
         }
         
         int first = Integer.parseInt(finalTime.substring(0,1));
         int Second = Integer.parseInt(finalTime.substring(1,2));
         int third = Integer.parseInt(finalTime.substring(3,4));
         int fourth = Integer.parseInt(finalTime.substring(4,5));

        if(first == 0 && (fourth - third) == (third - Second)){
               count++;
           }
        else{
            if((fourth - third) == (third - Second) && (third - Second) == (Second - first)){
               count++;
           }
         }
      }          
      System.out.println(count);
   }
   		
  }