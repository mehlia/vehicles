public class Plane extends Vehicle{

    private String airLine;
    private double ticketCost;

    public Plane(int maxOccupancy, String airLine, double ticketCost) {
        super(maxOccupancy);
        this.airLine = airLine;
        this.ticketCost = ticketCost;
    }

    public String getAirLine(){
        return this.airLine;
    }

    public double getTicketCost(){
        return this.ticketCost;
    }

    public double discountedTicket(int airMiles){
        double discount = airMiles >= 1000 ? 0.1 : 0.0;
        return ticketCost - (ticketCost * discount);
    }

}
