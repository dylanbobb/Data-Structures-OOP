package testscores;

public class TestScoresDemo
{
    public static void main(String[] args)
    {
        // Valid Scores
        double[] scores1 = {91,92,93,94,95};
        try
        {
            TestScores o1 = new TestScores(scores1);
            System.out.println(o1.average());
        }
        catch(InvalidTestScore e)
        {
        }
        
        // Test exception
        double[] scoresException = {-91, 105};
        try
        {
            TestScores o2 = new TestScores(scoresException);
            System.out.println(o2.average());
        }
        catch(InvalidTestScore e)
        {
            e.printStackTrace();
        }
    }
}