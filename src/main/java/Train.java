public class Train extends Vehicle{

    private String trainLine;
    private boolean doorsOpen;

    public Train(int maxOccupancy, String trainLine, boolean doorsOpen) {
        super(maxOccupancy);
        this.trainLine = trainLine;
        this.doorsOpen = doorsOpen;
    }

    public String getTrainLine(){
        return this.trainLine;
    }

    public String addTrainLine(String trainLine){
        return "TFL are adding a new trainline in 2022: " + trainLine;
    }

    public String checkDoorsStatus(){
        if (doorsOpen){
            return "PlEASE MIND THE GAP!";
        } else {
            return "Step away from the edge of the platform!";
        }

    }





}
