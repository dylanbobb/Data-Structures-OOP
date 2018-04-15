// This class models a stock
package stock;
public class Stock
{
    private int stockNumber;
    private Data data;

    // 2 Argument Constructor
    public Stock(int stockNumber,String name,int quantity)
    {
        this.stockNumber = stockNumber;
        this.data = new Data();
        data.setName(name);
        data.setQuantity(quantity);
    }

    // Getters
    public int getStockNumber()
    {
        return this.stockNumber;
    }
    
    public Data getData()
    {
        return this.data;
    }

    // HashCode and Equals based off stock number to prevent 2 stock objects from having the same stocknumber inside the hashmap.
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 73 * hash + this.stockNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Stock other = (Stock) obj;
        if (this.stockNumber != other.stockNumber) 
        {
            return false;
        }
        return true;
    }
    
    
}