package algorithm;

import java.util.ArrayList;
import java.util.ListIterator;

public class Algorithm
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 2; i <= 500000; i++)
        {
            list.add(i);
        }
        
        for(int i = 0; i < list.size() - 1; i++)
        {
            int currentPrime = list.get(i);
            ListIterator<Integer> it = list.listIterator(i+1);
            
            System.out.println(currentPrime);
            while(it.hasNext())
            {
                if(it.next() % currentPrime == 0)
                {
                    it.remove();
                }
            }
        }
        
        System.out.println(list);
    }
}