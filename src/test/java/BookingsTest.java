import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingsTest {


        private Bookings booking1;
        private Bedroom room1;

        @Before
        public void before(){
            room1 = new Bedroom(1,1, "Single", 10);
            booking1 = new Bookings(room1, 5);
        }


        @Test
        public void getBill(){
            assertEquals(50, booking1.totalBill());
        }

        @Test
    public void canMakeBooking() {
        booking1.bookRoom(room1, 2);
        assertEquals(room1, booking1.getBedroom());
    }
}
