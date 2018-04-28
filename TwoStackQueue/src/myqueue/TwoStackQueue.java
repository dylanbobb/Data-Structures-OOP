package myqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TwoStackQueue<E> implements MyQueueI<E>
{
    private Stack<E> inStack;
    private Stack<E> outStack;
    
    public TwoStackQueue()
    {
        this.inStack = new Stack();
        this.outStack = new Stack();
    }
    
    public TwoStackQueue(List<E> L)
    {
        super();
        for(E x:L)
        {
            inStack.push(x);
        }
    }
    
    @Override
    public E dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        else if(!outStack.isEmpty())
        {
            return outStack.pop();
        }
        else
        {
            while(!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }
    }
    
    @Override
    public void enqueue(E element)
    {
        inStack.push(element);
    }
    
    @Override
    public boolean isEmpty()
    {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    @Override
    public E peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        else if(!outStack.isEmpty())
        {
            return outStack.peek();
        }
        else
        {
            while(!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
            return outStack.peek();
        }
    }
}