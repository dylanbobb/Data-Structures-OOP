package hotelroom;

public class HotelRoom
{
    protected int roomNumber;
    protected double nightlyRate;
    
    public HotelRoom(int roomNumber)
    {
        this.roomNumber = roomNumber;
        
        if(roomNumber <= 299)
        {
            this.nightlyRate = 69.95;
        }
        else
        {
            this.nightlyRate = 89.95;
        }
    }
    
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    
    public void setNightlyRate(double nightlyRate)
    {
        this.nightlyRate = nightlyRate;
    }
    
    public int getRoomNumber()
    {
        return this.roomNumber;
    }
    
    public double getNightlyRate()
    {
        return this.nightlyRate;
    }
    
    @Override
    public String toString()
    {
        return "Room Number  : " + this.roomNumber + "\n" +
               "Nightly Rate : " + this.nightlyRate;
    }
}