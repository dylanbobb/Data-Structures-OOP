package hotelroom;

public class UseHotelRoom
{
    public static void main(String[] args)
    {
        HotelRoom[] arr = new HotelRoom[2];
        arr[0] = new HotelRoom(100);
        arr[1] = new Suite(560);
        for(HotelRoom x:arr)
        {
            System.out.println(x);
        }
    }
}