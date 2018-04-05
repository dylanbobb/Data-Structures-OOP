package testscores;

public class InvalidTestScore extends IllegalArgumentException
{
    public InvalidTestScore()
    {
        super("Scores in the array was negative or greater than 100.");
    }
}