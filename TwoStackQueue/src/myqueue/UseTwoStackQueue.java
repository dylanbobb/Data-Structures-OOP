package myqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseTwoStackQueue
{
    public static void main(String[] args)
    {
        List<String> listString = new ArrayList();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        
        List<String> linkedString = new LinkedList(listString);
        linkedString.add("end of linked list");
        
        TwoStackQueue<String> Q1 = new TwoStackQueue();
        TwoStackQueue<String> Q2 = new TwoStackQueue(listString);
        TwoStackQueue<String> Q3 = new TwoStackQueue(linkedString);
        TwoStackQueue<Integer> Q4 = new TwoStackQueue();
        
        Q1.enqueue("First");
        Q1.enqueue("Second");
        Q1.enqueue("Thrid");
        
        Q2.enqueue("Four");
        
        Q4.enqueue(new Integer(200));
        Q4.enqueue(new Integer(100));
        Q4.enqueue(new Integer(500));
        Q4.enqueue(50);
        
        System.out.println(" ******** Dequeue the Stack Q1");
        while(!Q1.isEmpty())
        {
            System.out.print(" " + Q1.dequeue());
        }
        
        System.out.println(" \n ******** The first element to dequeue in Q2");	
	System.out.print(" " + Q2.dequeue());
        
        System.out.println(" \n ******** Dequeue the Stack Q3");
        while(!Q3.isEmpty())
        {
            System.out.println(" " + Q3.dequeue());
        }
        
        System.out.println(" \n ******** Dequeue the Stack Q4");
        while(!Q4.isEmpty())
        {
            System.out.println(" " + Q4.dequeue());
        }
    }
}