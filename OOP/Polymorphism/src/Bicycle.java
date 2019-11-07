public class Bicycle {

    //initialize attributes
    int startCadence;
    int startSpeed;
    int startGear;

    // constructor method
    public Bicycle (int startCadence, int startSpeed, int startGear) {
        this.startCadence = startCadence;
        this.startSpeed = startSpeed;
        this.startGear = startGear;
    }

    public void printDescription() {
        System.out.println("\nBike is " + "in gear " + this.startGear + " with a cadence of " + this.startCadence + " and " +
                "travelling at a speed of " + this.startSpeed);
    }


}
