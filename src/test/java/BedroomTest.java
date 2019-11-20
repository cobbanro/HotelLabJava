import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1,1, "Single", 5);
        guest1 = new Guest("Cameron");
        }
    @Test
    public void addGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guests.size());
    }

}

