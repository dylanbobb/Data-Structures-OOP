package book;

public class Book implements Comparable<Book>
{
    private String title;
    private int pages;
    
    public Book(String title,int pages)
    {
        this.title = title;
        this.pages = pages;
    }
    
    @Override
    public int compareTo(Book other)
    {
        if(this.pages > other.pages)
        {
            return 1;
        }
        if(this.pages < other.pages)
        {
            return -1;
        }
        return 0;
    }
    
    @Override
    public String toString()
    {
        return this.title + " " + this.pages;
    }
}