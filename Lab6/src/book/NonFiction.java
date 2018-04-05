package book;

public class NonFiction extends Book
{
    public NonFiction(String title)
    {
        super(title);
        this.setPrice();
    }
    
    @Override
    public void setPrice()
    {
        this.price = 37.99;
    }
}