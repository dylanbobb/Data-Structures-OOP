package node;

public class Main
{
    public static void main(String[] args)
    {
        MyLinkedList<String> myList = new MyLinkedList();
        myList.addLast("Hi");
        myList.addLast("This");
        myList.addLast("Is");
        myList.addLast("A");
        myList.addLast("Test");
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
    }
}