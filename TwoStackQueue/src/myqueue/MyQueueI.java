package myqueue;

// This interface shows the basic methods needed to create a queue.
// For more detailed explanations of these methods, as well as to see there implmentation please refer to the TwoStackQueue Class.
public interface MyQueueI<E>
{
    public E dequeue();
    public void enqueue(E element);
    public boolean isEmpty();
    public E peek();
}
