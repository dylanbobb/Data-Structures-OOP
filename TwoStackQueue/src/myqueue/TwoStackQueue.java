package myqueue;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

// This class will create a queue (of any type) using two stacks.
// Methods will be implemented from the MyQueueI interface.
public class TwoStackQueue<E> implements MyQueueI<E>
{
    // Each queue will have an inStack & an outStack.
    private Stack<E> inStack;
    private Stack<E> outStack;
    
    // Default constructor
    public TwoStackQueue()
    {
        // Initializing the in an out stacks.
        this.inStack = new Stack();
        this.outStack = new Stack();
    }
    
    // Constructor to create a queue from a list.
    public TwoStackQueue(List<E> L)
    {
        // Calling the default constructor.
        this();
        
        // Enqueue each element in the list. Note: This is done with a forward moving for loop to keep a FIFO order which is essential for queues.
        for(E x:L)
        {
            enqueue(x);
        }
    }
    
    // Implementing the dequeue method from the MyQueueI interface.
    // This method will remove the element that was first inserted into the queue (FIFO) and return that element.
    @Override
    public E dequeue()
    {
        // If the queue is empty, no element can be removed and as such, a NoSuchElementException will be thrown.
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        // Otherwise, if the outStack (items that are ready to be removed in an appropriate order) is not empty, we simply pop an element from that stack and return it.
        else if(!outStack.isEmpty())
        {
            return outStack.pop();
        }
        // Otherwise we push each element from the instack to the outstack to reverse the order (important for FIFO) and then pop and element from the outStack (and return it).
        else
        {
            while(!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }
    }
    
    // Implementing the enqueue method from the MyQueueI interface.
    // This method will enqueue an element into the queue by pushing it into the inStack.
    @Override
    public void enqueue(E element)
    {
        inStack.push(element);
    }
    
    // Implementing the isEmpty method from the MyQueueI interface.
    // This method will return true if the in and out stacks are both empty (collectively these stacks form the queue), otherwise it will return false.
    @Override
    public boolean isEmpty()
    {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    // Implementing the peek method from the MyQueueI interface.
    // This method will return the first element in the queue (What will be removed if the dequeue method is called).
    @Override
    public E peek()
    {
        // If the queue is empty, no element can be peeked at, So a NoSuchElementException will be thrown.
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        // Otherwise, if the outStack (items that are ready to be removed in an appropriate order) is not empty, we simply return the first element in that stack using the stack's peek method.
        else if(!outStack.isEmpty())
        {
            return outStack.peek();
        }
        // Otherwise we push each element from the instack to the outstack to reverse the order (important for FIFO) and then simply return the first element in the outstack using the stack's peek method.
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