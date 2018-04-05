package horse;

import java.time.LocalDate;

public class Horse
{
    protected String name;
    protected String color;
    protected LocalDate dob;
    
    public Horse(String name, String color, LocalDate dob)
    {
        this.name = name;
        this.color = color;
        this.dob = dob;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public LocalDate getDob()
    {
        return this.dob;
    }
    
    public void display()
    {
        System.out.println("Name          : " + this.name);
        System.out.println("Color         : " + this.color);
        System.out.println("Date Of Birth : " + this.dob);
    }
}