import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DemoSort
{
    public static void main(String[] args)
    {
        LinkedList<Book> list = new LinkedList();
        list.add(new Book(5,"A"));
        list.add(new Book(43,"Z"));
        list.add(new Book(2,"B"));
        list.add(new Book(40,"X"));
        insertionSort(list);
        //selectionSort(list);
        //bubbleSort(list);
        System.out.println(list);
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
    
//    public static void insertionSort(ArrayList<Integer> list)
//    {
//        for(int i = 1; i < list.size(); i++)
//        {
//            int currentElement = list.get(i);
//            int k;
//            for(k = i -1; k>= 0 && list.get(k) > currentElement; k--)
//            {
//                list.set(k+1,list.get(k));
//            }
//            list.set(k+1,currentElement);
//        }
//    }
    
    public static<E extends Comparable> void insertionSort(LinkedList<E> list)
    {
        for(int i = 1; i < list.size(); i++)
        {
            E currentElement = list.get(i);
            int k;
            for(k = i - 1; k>=0 && list.get(k).compareTo(currentElement) > 0; k--)
            {
                list.set(k+1,list.get(k));
            }
            list.set(k+1,currentElement);
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
    
//    public static void selectionSort(LinkedList<Integer> list)
//    {
//        for(int i = 0; i < list.size(); i++)
//        {
//            int currentMax = list.get(i);
//            int currentMaxIndex = i;
//            for(int j = i + 1; j < list.size(); j++)
//            {
//                if(currentMax < list.get(j))
//                { 
//                    currentMax = list.get(j);
//                    currentMaxIndex = j;
//                }
//            }
//            
//            if(currentMaxIndex != i)
//            {
//                list.set(currentMaxIndex,list.get(i));
//                list.set(i,currentMax);
//            }
//        }
//    }
    
    public static<E extends Comparable> void selectionSort(LinkedList<E> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            E currentMax = list.get(i);
            int currentMaxIndex = i;
            for(int j = i + 1; j < list.size(); j++)
            {
                if(currentMax.compareTo(list.get(j)) < 0)
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
    
//    public static void bubbleSort(LinkedList<Integer> list)
//    {
//       boolean needNextPass = true;
//       for(int k = 1; k < list.size() && needNextPass; k++)
//       {
//           needNextPass = false;
//           for(int i = 0; i < list.size() - k; i++)
//           {
//               if(list.get(i) > list.get(i+1))
//               {
//                   int temp = list.get(i);
//                   list.set(i, list.get(i+1));
//                   list.set(i+1,temp);
//                   needNextPass = true;
//               }
//           }
//       }
//    }
    
    public static <E extends Comparable> void bubbleSort(LinkedList<E> list)
    {
        boolean needNextPass = true;
        for(int k = 1; k < list.size() && needNextPass; k++)
        {
            needNextPass = false;
            for(int i = 0; i < list.size() - k; i++)
            {
                if(list.get(i).compareTo(list.get(i+1)) > 0)
                {
                    E temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                    needNextPass = true;
                }
            }
        }
    }
}