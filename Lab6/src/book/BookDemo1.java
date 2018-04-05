package book;

public class BookDemo1
{
    public static void main(String[] args)
    {
        Book[] arr = new Book[2];
        arr[0] = new Fiction("Fiction title");
        arr[1] = new NonFiction("NonFiction title");
        
        for(Book x:arr)
        {
            System.out.println(x);
        }
    }
}