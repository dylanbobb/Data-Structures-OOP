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
    public void add(int index,E object)
    {
        if(isEmpty() || index <= 0)
        {
            addFirst(object);
        }
        else if(index >= size)
        {
            addLast(object);
        }
        else
        {
            Node<E> newNode = new Node(object);
            Node<E> current = head;
            for(int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }
    
    @Override
    public E remove(int index)
    {
        if(isEmpty())
        {
            throw new IndexOutOfBoundsException();
        }
        else if(index <= 0)
        {
            Node<E> temp = head;
            removeFirst();
            return temp.element;
        }
        else if(index == size - 1 || index >= size)
        {
            Node<E> temp = tail;
            removeLast();
            return temp.element;
        }
        else
        {
            Node<E> current = head;
            for(int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = current.next.next;
            return temp.element;
        }
    }
}