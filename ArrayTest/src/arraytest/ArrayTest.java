package arraytest;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] intArr = {1,2,3,4,5};
        doubleElement(intArr[0]);
        System.out.println();
        for(int i = 0; i < 5; i++)
        {
            System.out.println(intArr[i]);
        }
        doubleArray(intArr);
        System.out.println();
        for(int i = 0; i < 5; i++)
        {
            System.out.println(intArr[i]);
        }
    }
    
    public static void doubleElement(int i)
    {
        i *= 2;
        System.out.println(i);
    }
    
    public static void doubleArray(int[] myArray)
    {
        myArray[0] *= 2;
    }
    
    public static int[] getArray()
    {
        int[] scores = {1,2,3,4,5};
        return scores;
    }
}