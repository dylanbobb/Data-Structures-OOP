package book;

public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        this.setPrice();
    }
    
    @Override
    public void setPrice()
    {
        this.price = 24.99;
    }
}