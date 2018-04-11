package stock;
public class Data
{
    private String name;
    private int quantity;
            
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + this.name + " Quantity: " + this.quantity;
    }
}