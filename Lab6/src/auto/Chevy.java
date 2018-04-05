package auto;

public class Chevy extends Auto
{
    public Chevy()
    {
        super("Chevy");
    }
    
    @Override
    public void setPrice()
    {
        this.price = 22000;
    }
}