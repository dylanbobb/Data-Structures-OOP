package book;

public class BookDemo2
{
    public static void main(String[] args)
    {
        Book[] arr = new Book[4];
        arr[0] = new Fiction("Fiction 0");
        arr[1] = new Fiction("Fiction 1");
        arr[2] = new NonFiction("NonFiction 0");
        arr[3] = new NonFiction("NonFiction 2");
        
        for(Book x:arr)
        {
            System.out.println(x);
        }
    }
}