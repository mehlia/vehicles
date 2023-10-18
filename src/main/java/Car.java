public class Car extends Vehicle{

    private String fuelType;
    private String travelType;
    private String colour;
    private String make;
    private double price;

    public Car(int numberOfWheels, int numberOfDoors, int maxOccupancy, String fuelType, String travelType, String colour, String make, double price){
        super(numberOfWheels, numberOfDoors, maxOccupancy);
        this.fuelType = fuelType;
        this.travelType = travelType;
        this.colour = colour;
        this.make = make;
        this.price = price;
    }

    public String getFuelType(){
        return fuelType;
    }

    public String getTravelType() {
        return travelType;
    }

    public String getColour(String colour){
        return this.colour = colour;
    }

    public String addMake(String make){
        return "The make of this car is " + make + " and is worth £" + price;
    }
}
