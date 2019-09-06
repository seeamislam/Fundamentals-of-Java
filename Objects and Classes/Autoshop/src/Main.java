import java.awt.*;

public class Main {

    public static void main(String[] args) {

// let's build car objects
        Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE, true); // build instance 1 of car (first object)

        Car sallyCar = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false); // build instance 2 (second car)

        System.out.println("My Car's License Plate: " + myCar.licensePlate); // print attributes of the car
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

        System.out.println(myCar.paintColor.toString());

        // Now, we can manipulate objects using methods

        myCar.changePaintColor(Color.RED); // execute method which changes the color of the car

        System.out.println(myCar.paintColor.toString()); // print the new color of the car (must turn the color to string)

    }
}