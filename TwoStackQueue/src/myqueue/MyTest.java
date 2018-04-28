package myqueue;

import java.util.ArrayList;

public class MyTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList();
        al.add(2);
        
        TwoStackQueue<Integer> tsq = new TwoStackQueue(al);
    }
}