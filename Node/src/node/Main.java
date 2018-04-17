package node;

public class Main
{
    public static void main(String[] args)
    {
        // Empty
        Node<String> head = null;
        Node<String> tail = null;
        
        // Add 1 node
        head = new Node("Chicago");
        tail = head;
        
        // Adding another node
        tail.next = new Node("Denver");
        tail = tail.next;
        
        // Adding one more
        tail.next = new Node("LA");
        tail = tail.next;
        
        // Printing the list
        Node<String> current = head;
        
        while(current != null)
        {
            System.out.println(current);
            current = current.next;
        }
    }
}