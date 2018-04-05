package point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PointDemo
{
    public static void main(String[] args)
    {
        ArrayList<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(7,3));
        list.add(new Point(3,3));
        list.add(new Point(7,1));
        list.add(new Point(10,15));
        
        Collections.sort(list);
        System.out.println("Increasing x list");
        list.forEach(x ->
        {
            System.out.println(x);
        });
        
        Collections.sort(list,new PointComparator());
        System.out.println("Increasing y list");
        list.forEach(x ->
        {
            System.out.println(x);
        });
        
        Point[] arr = new Point[5];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);
        System.out.println("Increasing x array");
        for(Point x:arr)
        {
            System.out.println(x);
        }
        
        Arrays.sort(arr,new PointComparator());
        System.out.println("Increasing y array");
        for(Point x:arr)
        {
            System.out.println(x);
        }
    }
}