//**********************************************************
// Assignment: J6A4
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 25 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        String word;
        int x = 0;
        int vowels = 0;
        int consonants = 0; // declare variables

        do {
            System.out.println("Enter a word");
            Scanner input = new Scanner(System.in);
            word = input.nextLine();
            
                if (!(word.equalsIgnoreCase("stop"))) { // check if stop was inputted
                
                    for (x = 0; x < word.length(); x++) {
                        char letter = word.charAt(x);
                        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                            vowels += 1; // accumulate number of vowels
                        } else {
                            consonants += 1; // accumulate number of consonants
                        }
                    }
                    System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
                    vowels = 0;
                    consonants = 0; // reset variables
               }
            }
                while (!(word.equalsIgnoreCase("stop")));
        }
    }