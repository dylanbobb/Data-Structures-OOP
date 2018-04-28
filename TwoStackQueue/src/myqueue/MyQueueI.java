package myqueue;

public interface MyQueueI<E>
{
    public E dequeue();
    public void enqueue(E element);
    public boolean isEmpty();
    public E peek();
}
