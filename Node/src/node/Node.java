package node;

public class Node<E>
{
    E element;
    Node<E> next;
    
    public Node(E o)
    {
        element = o;
    }
    
    @Override
    public String toString()
    {
        return (String) element;
    }
}