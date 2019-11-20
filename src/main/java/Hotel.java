import java.util.ArrayList;

public class Hotel {
    public ArrayList<Bedroom> bedrooms;
    private String name;

    public Hotel(ArrayList<Bedroom> bedrooms, String name){
        this.bedrooms = bedrooms;
        this.name = name;
    }

    public void add(Guest guest, Bedroom bedroom) {
        if (bedroom.guests.size() < 1) {
            bedroom.addGuest(guest);
        }
    }

    public int vacantBedrooms() {
        ArrayList<Bedroom> vacant = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom == null) {
                vacant.add(bedroom);
            }
        }
        return vacant.size();
    }
}
