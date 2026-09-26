public class Rooms {
    private String name;
    private Rooms northExit;
    private Rooms southExit;
    private Rooms eastExit;
    private Rooms westExit;

    public Rooms(String nameParam){
        this.name = nameParam;
    }
    public void setExits(Rooms north, Rooms south, Rooms east, Rooms west){
        this.northExit = north;
        this.southExit = south;
        this.eastExit = east;
        this.westExit = west;
    }
    public Rooms getNorthExit() {
        return northExit;
    }
    public Rooms getSouthExit(){
        return southExit;
    }
    public Rooms getEastExit(){
        return eastExit;
    }
    public Rooms getWestExit(){
        return westExit;
    }

    public String getRoom(){
        return name;
    }
}
