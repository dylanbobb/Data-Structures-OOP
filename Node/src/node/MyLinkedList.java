package node;

public class MyLinkedList<E> implements MyList<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public MyLinkedList()
    {
        head=tail=null;
        size =0;
    }
    
    public MyLinkedList(E[] elements)
    {
        head = tail = null;
        size = 0;
        for(E e:elements)
        {
            addLast(e);
        }
    }
    
    public void addFirst(E e)
    {
        Node<E> newNode = new Node(e);
        if(size == 0)
        {
            head = newNode;
            tail = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(E e)
    {
        Node<E> newNode = new Node(e);
        if(size == 0)
        {
            tail = newNode;
            head = tail;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public E getFirst()
    {
        return head.element;
    }
    
    public E getLast()
    {
        return tail.element;
    }
    
    public E removeFirst()
    {
        if(size == 0)
        {
            return null;
        }
        if(size == 1)
        {
            E temp = head.element;
            head = tail = null;
            size = 0;
            return temp;
        }
        E temp = head.element;
        head = head.next;
        size--;
        return temp;
    }
    
    public E removeLast()
    {
        if(size == 0)
        {
            return null;
        }
        if(size == 1)
        {
            E temp = tail.element;
            head = tail = null;
            size = 0;
            return temp;
        }
        E temp = tail.element;
        Node<E> current = head;
        while(current != tail)
        {
            current = current.next;
        }
        tail = current;
        size--;
        return temp;
    }
    
    @Override
    public void clear()
    {
        head = tail = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    @Override
    public boolean contains(E object){return false;}
    
    @Override
    public int indexOf(E object){return Integer.MIN_VALUE;}
    
    @Override
    public E get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        int counter = 0;
        while(current != null)
        {
            if(counter == index)
            {
                return current.element;
            }
            counter++;
            current = current.next;
        }
        return null;
    }
    
    @Override
    public void set(E object,int index){}
    
    @Override
    public int size()
    {
        return size;
    }
    
    @Override
    public void add(int index,E object){}
    
    @Override
    public E remove(int index){return null;}
}