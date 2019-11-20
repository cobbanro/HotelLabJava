import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    public ArrayList<Guest> guests;
    private String roomType;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String roomType, int nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public void addGuest(Guest guest1) {
        this.guests.add(guest1);
    }
    public int nightlyRate(){
        return this.nightlyRate;
    }
}
