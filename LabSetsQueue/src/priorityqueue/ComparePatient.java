package priorityqueue;

import java.util.Comparator;

public class ComparePatient implements Comparator<Patient>
{
    @Override
    public int compare(Patient p1,Patient p2)
    {
        if(p1.getEmergencyCase() && !p2.getEmergencyCase())
        {
            return -1;
        }
        if(p1.getEmergencyCase() == p2.getEmergencyCase())
        {
            Integer p1Int = p1.getIdNumber();
            return p1Int.compareTo(p2.getIdNumber());
        }
        return 1;
    }
}