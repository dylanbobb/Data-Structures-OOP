// This class stores the value part of the hashmap (name and quantity). The Stock class is composed of this class
package stock;
public class Data
{
    private String name;
    private int quantity;

    // Getters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Visual Representation of the values.
    @Override
    public String toString()
    {
        return "Name: " + this.name + " Quantity: " + this.quantity;
    }
}