package parkeruniversity;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student[] arr = new Student[3];
        arr[0] = new UndergraduateStudent(0,"Bobb");
        arr[1] = new GraduateStudent(1,"Dylan");
        arr[2] = new StudentAtLarge(2,"Sean");
        
        for(Student x:arr)
        {
            System.out.println(x);
        }
    }
}