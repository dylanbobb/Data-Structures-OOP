package horse;

import java.time.LocalDate;
import java.util.ArrayList;

public class UseHorse
{
    public static void main(String[] args)
    {
        Horse[] horseArr = new Horse[2];
        horseArr[0] = new Horse("Dylan","Red",LocalDate.now());
        horseArr[1] = new RaceHorse("Bobb","Blue",LocalDate.now(),0);
        ArrayList<RaceHorse> raceList = new ArrayList();
        raceList.add(new RaceHorse("Sean","Green",LocalDate.now(),1));
        raceList.add(new RaceHorse("Mitch","Brown",LocalDate.now(),2));
        raceList.add(new RaceHorse("Bruce","Black",LocalDate.now(),3));
        
        for(Horse x:horseArr)
        {
            x.display();
        }
        
        raceList.forEach((x) -> {
            x.display();
        });
    }
}