package auto;

public class Ford extends Auto
{
    public Ford()
    {
        super("Ford");
    }
    
    @Override
    public void setPrice()
    {
        this.price = 20000;
    }
}