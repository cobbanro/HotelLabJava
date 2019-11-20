import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest1;
    private Bedroom room1;
    private Bedroom room2;
    private Bedroom room3;
    private Bedroom room4;
    private Bedroom room5;
    private Bookings booking1;

    @Before
    public void before(){
        ArrayList<Bedroom> bedrooms = new ArrayList();
        room1 = new Bedroom(1,1,"Single", 10);
        bedrooms.add(room1);
        bedrooms.add(room2);
        bedrooms.add(room3);
        bedrooms.add(room4);
        bedrooms.add(room5);
        hotel = new Hotel(bedrooms, "Dev's Patel");
        guest1 = new Guest("Cameron");
        booking1 = new Bookings(room1, 1);
    }

    @Test
    public void addBooking(){
        room1.addGuest(guest1);
        assertEquals(1, room1.guests.size());
    }

    @Test
    public void vacantRoom(){
        room1.addGuest(guest1);

        assertEquals(4, hotel.vacantBedrooms());
    }

}
