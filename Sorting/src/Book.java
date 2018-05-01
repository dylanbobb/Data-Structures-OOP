public class Book implements Comparable<Book>
{
    private int pages;
    private String title;
    
    public Book(int pages,String title)
    {
        this.pages = pages;
        this.title = title;
    }
    
    @Override
    public int compareTo(Book o)
    {
        return this.pages - o.pages;
    }
    
    @Override
    public String toString()
    {
        return pages + " " + title;
    }
}