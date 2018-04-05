package horse;

import java.time.LocalDate;

public class RaceHorse extends Horse
{
    private int numRaces;
    
    public RaceHorse(String name, String color, LocalDate dob, int numRaces)
    {
        super(name,color,dob);
        this.numRaces = numRaces;
    }
    
    private void setNumRaces(int numRaces)
    {
        this.numRaces = numRaces;
    }
    
    private int getNumRaces()
    {
        return this.numRaces;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Races         : " + this.numRaces);
    }
}