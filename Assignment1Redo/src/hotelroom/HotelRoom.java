package hotelroom;

public class HotelRoom
{
    protected int roomNum;
    protected double rate;
    
    public int getRoomNum()
    {
        return this.roomNum;
    }
    
    public double getRate()
    {
        return this.rate;
    }
    
    public HotelRoom(int roomNum)
    {
        this.roomNum = roomNum;
        
        if(roomNum <= 299)
        {
            this.rate = 69.95;
        }
        else
        {
            this.rate = 89.95;
        }
    }
    
    @Override
    public String toString()
    {
        return this.roomNum + " " + this.rate;
    }
}