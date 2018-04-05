package arraystest;

import java.util.Arrays;

public class ArraysTest
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.binarySearch(new int[]{1,2,3,7,14}, 7));
        System.out.println(Arrays.binarySearch(new int[]{1,2,3,7,14}, 5));
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 7, 14}, new int[]{1, 2, 3, 7,14,}));
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 7, 14}, new int[]{1, 2, 3, 14,7}));
    }
    
}