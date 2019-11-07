import java.awt.*; // import a java library

// we can import different Java libraries which contain classes and methods

//EX: java.lang contains math class
// Math.pow(5, 3) <-- Math is the class and pow is the method within that class
// java.util contains utility methods such as scanning, formatting strings, data manipulation

public class Car { // We want a blueprint to create all our cars
    // each car object (instance) will have a set of attributes (which are variable values)

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    // Now, to build the car instances, we need a constructor method (method must be public so it can be accessed by Main method)

    public Car(double inputAverageMPG,         // all methods have arguments, just like always
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking) {

        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;

    } // this constructor can now product car objects with these properties

    public void changePaintColor(Color newPaintColor) { // another method which changes the color of a car (build your methods here)
        this.paintColor = newPaintColor;
    }

}
