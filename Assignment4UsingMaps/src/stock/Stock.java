package stock;
public class Stock
{
    private int stockNumber;
    private String name;
    private int quantity;
    
    public Stock(int stockNumber,String name, int quantity)
    {
        this.stockNumber = stockNumber;
        this.name = name;
        this.quantity = quantity;
    }
}