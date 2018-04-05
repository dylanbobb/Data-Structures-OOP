package hotelroom;

public class Suite extends HotelRoom
{
    public Suite(int roomNumber)
    {
        super(roomNumber);
        this.nightlyRate += 40;
    }
}