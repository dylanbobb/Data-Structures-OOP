import java.util.Arrays;
import java.util.LinkedList;

public class DemoSort
{
    public static void main(String[] args)
    {
        int[] ar = {2,7,322,46,1,7,6,1,5,6,7,653,-3};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }
    
    public static void insertionSort(double[] list)
    {
        for(int i = 1; i < list.length; i++)
        {
            double currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--)
            {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
    
    public static void selectionSort(double[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            double currentMax = list[i];
            int currentMaxIndex = i;
            for(int j = i + 1; j < list.length; j++)
            {
                if(currentMax < list[j])
                { 
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            
            if(currentMaxIndex != i)
            {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
    
    public static void selectionSort(LinkedList<Double> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            double currentMax = list.get(i);
            int currentMaxIndex = i;
            for(int j = i + 1; j < list.size(); j++)
            {
                if(currentMax < list.get(j))
                { 
                    currentMax = list.get(j);
                    currentMaxIndex = j;
                }
            }
            
            if(currentMaxIndex != i)
            {
                list.set(currentMaxIndex,list.get(i));
                list.set(i,currentMax);
            }
        }
    }
    
    public static void bubbleSort(int[] list)
    {
        boolean needNextPass = true;
        for(int k = 1; k < list.length && needNextPass; k++)
        {
            needNextPass = false;
            for(int i = 0; i < list.length - k; i++)
            {
                if(list[i] > list[i+1])
                {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}