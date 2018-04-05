package hotelroom;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHotelRoom
{
    public static void main(String[] args)
   {
        HotelRoom h1 = new HotelRoom(200);
        Suite s1 = new Suite(234);
        
        System.out.println("Testing setters and getters for hotel and Suite :");
        h1.setRoomNumber(4);
        System.out.println(h1.getRoomNumber());
        s1.setNightlyRate(54);
        System.out.println(s1.getNightlyRate());
        
        HotelRoom[] array = new HotelRoom[5];
        array[0] = new HotelRoom(101);
        array[1] = new HotelRoom(102);
        array[2] = new Suite(500);
        array[3] = new Suite(501);
        array[4] = new Suite(541);
        
        System.out.println("\nTesting arrays : ");
        for(HotelRoom x:array)
        {
            System.out.println(x);
            System.out.println();
        }
        
        ArrayList<HotelRoom> list = new ArrayList(Arrays.asList(array));
        list.add(new HotelRoom(341));
        list.add(new HotelRoom(342));
        list.add(new HotelRoom(435));
        list.add(new Suite(899));
        list.add(new Suite(900));
        
        System.out.println("Testing ArrayList : ");
        for(HotelRoom x:list)
        {
            System.out.println(x);
            System.out.println();
        }
    }
}