package testscores;

public class TestScores
{
    private double[] scores;
    
    public TestScores(double[] scores) throws InvalidTestScore
    {
        this.scores = scores;
        
        for(int i = 0; i < scores.length; i++)
        {
            if(scores[i] < 0 || scores[i] > 100)
            {
            throw new InvalidTestScore();
            }
        }

    }
    
    public double average()
    {
        double sum = 0;
        for(int i = 0; i < scores.length; i++)
        {
            if(scores[i] < 0 || scores[i] > 100)
            {
                throw new InvalidTestScore();
            }
            sum += scores[i];
        }
        return sum / scores.length;
    }
}