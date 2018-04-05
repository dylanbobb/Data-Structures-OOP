package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PatientDriver
{
    public static void main(String[] args)
    {
        PriorityQueue<Patient> patientQueue = new PriorityQueue(10,new ComparePatient());
        patientQueue.add(new Patient(1,"Patient1",false));
        patientQueue.add(new Patient(2,"Patient2",false));
        patientQueue.add(new Patient(3,"Patient3",true));
        patientQueue.add(new Patient(4,"Patient4",false));
        patientQueue.add(new Patient(5,"Patient5",true));
        
        
        while(patientQueue.size() > 0)
        {
            System.out.println(patientQueue.remove());
        }
    }
}