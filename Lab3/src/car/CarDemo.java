package car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarDemo
{
    public static void main(String[] args)
    {
        System.out.println("Standard Consturction: ");
        Car firstCar = new Car(2009,Model.MINIVAN,Color.BLUE);
        Car secondCar = new Car(2011,Model.CONVERTIBLE,Color.RED);
        firstCar.display();
        secondCar.display();
        
        System.out.println();
        System.out.println("Array: ");
        Car[] carArr = new Car[3];
        carArr[0] = new Car(2000,Model.SEDAN,Color.BLACK);
        carArr[1] = new Car(2001,Model.CONVERTIBLE,Color.GREEN);
        carArr[2] = new Car(2002,Model.MINIVAN,Color.RED);
        for(Car x:carArr)
        {
            x.display();
        }
        
        System.out.println();
        System.out.println("ArrayList: ");
        ArrayList<Car> carList = new ArrayList(Arrays.asList(carArr));
//        carList.add(new Car(2005,Model.CONVERTIBLE,Color.BLACK));
//        carList.add(new Car(2006,Model.MINIVAN,Color.BLUE));
//        carList.add(new Car(2007,Model.MINIVAN,Color.GREEN));

        carList.forEach((x) ->
        {
            x.display();
        });
    }
}