package hotelroom;

public class Suite extends HotelRoom
{
    public Suite(int roomNum)
    {
        super(roomNum);
        this.rate += 40;
    }
}