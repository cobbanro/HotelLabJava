public class Bookings {

    public Bedroom bedroom;
    public int nightsBooked;

    public Bookings( Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public void bookRoom(Bedroom bedroom1, int nights) {
        bedroom = bedroom1;
        this.nightsBooked = nights;
    }

    public int totalBill(){
       return this.nightsBooked * this.bedroom.nightlyRate();
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
