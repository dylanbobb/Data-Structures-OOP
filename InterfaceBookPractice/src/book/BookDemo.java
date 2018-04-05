package book;

import java.util.Arrays;
import java.util.Collections;

public class BookDemo
{
    public static void main(String[] args)
    {
        Book[] arr = new Book[5];
        int pages = 5;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = new Book("Title", pages);
            pages--;
        }
        
        Arrays.sort(arr);
        
        for(Book x:arr)
        {
            System.out.println(x);
        }
        
        Collections.reverse(Arrays.asList(arr));
        
        for(Book x:arr)
        {
            System.out.println(x);
        }
    }
}