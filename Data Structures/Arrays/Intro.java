import java.util.Arrays; // import a class which already contains various methods for manipulating arrays (sorting, searching)
import java.lang.reflect.Array;

public class Intro {
    public static void main(String[] args) {

       /* String userInput = "entertainment";
        String upperCased = userInput.toUpperCase();
        System.out.println(upperCased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);
        System.out.println("Contains: " + userInput.contains("Enter")); // using the contain method, we can see if userInput has "Enter" in it
      */

       int[] numbers = new int[5]; // declare an int array with 5 indexes, but, you can't change the number of indexes here.
        // people use vectors because they're dynamic (you can add more indexes)

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 = {31, 45, 22, 98, 10}; // declare, initialize, and allocate in one step

        Arrays.sort(numbers); // sorts the numbers in the array by ascending
        // array class methods (methods that the array class calls, instead of a specific object/instance)
        // there are a lot of array methods we can call

        System.out.println(Arrays.toString(numbers)); // you can't just print an array because its a reference in memory
        //using this array method, we can just print the array but as a string

        //String array

        String[] myFavouriteCandyBars = {"Twix", "Hershey", "Crunch"}; // you can have a string array too
        System.out.println("Index 1: " + myFavouriteCandyBars[1]);
        System.out.println("The length of the array is: " + myFavouriteCandyBars.length);

        System.out.println(Array.get(myFavouriteCandyBars, 2)); // this uses a method from the Array class (a premade class of array methods) and lets us just pull the value at index 2 (a shorter version)
    }
}
