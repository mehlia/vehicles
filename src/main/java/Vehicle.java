public abstract class Vehicle {

//    protected String vehicleType;
    protected String brand;
    protected int numberOfWheels;
    protected int numberOfDoors;
    protected int maxOccupancy;
    protected boolean airOrGround;
    protected boolean tfl;
    protected String driver;


    public Vehicle(String brand, int numberOfWheels, int numberOfDoors, int maxOccupancy, boolean airOrGround, boolean tfl){
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.maxOccupancy = maxOccupancy;
        this.airOrGround = airOrGround;
        this.tfl = tfl;
        this.driver = driver;
    }

    public Vehicle(int numberOfWheels, int numberOfDoors, int maxOccupancy, ) {
    }

    public Vehicle(int maxOccupancy) {
    }

    public String assignDriver() {
        this.driver = driver;
    }

    public String getDriver(){
        return "The driver of this vehicle is " + driver;
    }

    public String getPassenger(){
        return "The passenger of this vehicle is " + getPassenger();
    }


//    public boolean tflPublic(){
//        return this.tfl;
//    }

}
