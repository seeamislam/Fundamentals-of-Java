import java.util.Arrays; // import Array class which contains array methods
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        // we want to make an array full of objects (so the data type of the array will be the class)
        // Let's make an array with 3 objects that are students (meaning 7 instances of the class)
        // Each instance (student) will have their own unique attributes and can interact using methods
        // the main method is where we create each unique student and execute methods

        Student[] arr = new Student[3]; // declare an array of type student which holds 7 values

        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "John");
        arr[2] = new Student(3, "Terry");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("The student's name is: " + arr[i].name + " and their role num is: " + arr[i].roll_no);

        }

    }
}
