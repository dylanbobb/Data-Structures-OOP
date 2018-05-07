import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DemoSort
{
    public static void main(String[] args)
    {
        ArrayList<Book> bl = new ArrayList();
        bl.add(new Book(2,"a"));
        bl.add(new Book(16,"b"));
        bl.add(new Book(1,"c"));
        bl.add(new Book(5,"d"));
        bl.add(new Book(5423,"e"));
        
        mergeSort(bl);
        System.out.println(bl);
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
    
    public static void mergeSort(int[] list)
    {
        if(list.length > 1)
        {
            // Merge sort the first half.
            int[] firstHalf = new int[list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);
            // Merge sort yhe second half;
            int secondHalfLength = list.length - list.length/2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);
            // Merge firstHalf with secondHalf into list.
            merge(firstHalf,secondHalf,list);
        }
    }
    
    public static void merge(int[] list1,int[] list2,int[] temp)
    {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < list1.length && current2 < list2.length)
        {
            if(list1[current1] < list2[current2])
            {
                temp[current3++] = list1[current1++];
            }
            else
            {
                temp[current3++] = list2[current2++];
            }
        }
        while(current1 < list1.length)
        {
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length)
        {
            temp[current3++] = list2[current2++];
        }
    }
    
    public static <E extends Comparable> void mergeSort(List<E> list)
    {
        if(list.size() > 1)
        {
            List<E> firstHalf = new ArrayList();
            for(int i = 0; i < list.size() / 2; i++)
            {
                firstHalf.add(list.get(i));
            }
            mergeSort(firstHalf);
            List<E> secondHalf = new ArrayList();
            for(int i = list.size() / 2; i < list.size(); i++)
            {
                secondHalf.add(list.get(i));
            }
            mergeSort(secondHalf);
            merge(firstHalf,secondHalf,list);
        }
    }
    
    public static <E extends Comparable> void merge(List<E> list1,List<E> list2,List<E> temp)
    {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < list1.size() && current2 < list2.size())
        {
            if(list1.get(current1).compareTo(list2.get(current2)) < 0)
            {
                temp.set(current3,list1.get(current1));
                current3++;
                current1++;
            }
            else
            {
                temp.set(current3,list2.get(current2));
                current3++;
                current2++;
            }
        }
        while(current1 < list1.size())
        {
            temp.set(current3,list1.get(current1));
            current3++;
            current1++;
        }
        while(current2 < list2.size())
        {
            temp.set(current3,list2.get(current2));
            current3++;
            current2++;
        }
    }
}