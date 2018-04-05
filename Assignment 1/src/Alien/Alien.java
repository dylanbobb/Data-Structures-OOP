package alien;

public class Alien
{
    protected int numEyes;
    protected String color;
    protected int age;
    
    public Alien(int numEyes, String color, int age)
    {
        this.numEyes = numEyes;
        this.color = color;
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "Number of Eyes : " + this.numEyes + "\n" +
               "Color          : " + this.color   + "\n" +
               "Age            : " + this.age;
    }
}