package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {
    public static void main(String[] args) {


        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        System.out.println("Fast Cars -  Traditional Cars");
        System.out.println(filterFastCars(carList));

        System.out.println("New Cars - Traditional Cars");
        System.out.println(filterNewCars(carList));

        System.out.println("Fast Car - Behavior Parameterization");
        System.out.println(filter(carList,new CarFastPredicate()));

        System.out.println("New Car - Behavior Parameterization");
        System.out.println(filter(carList,new CarNewPredicate()));


        System.out.println("Fast Car - Lambda");
        CarPredicate carPredicate = car -> car.getTopSpeed()>160;
        System.out.println(filter(carList,carPredicate));


        System.out.println("New Cars - Lambda");
        System.out.println(filter(carList, (CarPredicate) car->car.getYear()>2015));

        System.out.println("Fast Car - Functional Interface usage");
        Predicate<Car> carPredicate2 = car -> car.getTopSpeed()>160;
        System.out.println(filter2(carList, carPredicate2));


        System.out.println("New Cars - Functional Interface usage");
        Predicate<Car> carPredicate3= car -> car.getYear()>2015;
        System.out.println(filter2(carList, carPredicate3));



    }



    private static List<Car>filter(List<Car> carList,CarPredicate carPredicate){

        List<Car> filteredCar = new ArrayList<>();

        for (Car eachCar : carList) {
                 if (carPredicate.test(eachCar)){
                     filteredCar.add(eachCar);
                 }
        }

return filteredCar;
    }



    private static List<Car> filterFastCars(List<Car> carList) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car eachCar : carList) {
            if (eachCar.getTopSpeed() > 160) {
                filteredCar.add(eachCar);
            }
        }


        return filteredCar;
    }

    private static List<Car> filterNewCars(List<Car> carList) {

        List<Car> filteredCar = new ArrayList<>();

        for (Car eachCar : carList) {
            if (eachCar.getYear() >2015) {
                filteredCar.add(eachCar);
            }
        }
return filteredCar;

    }
    private static List<Car>filter2(List<Car> carList, Predicate<Car> carPredicate){

        List<Car> filteredCar = new ArrayList<>();

        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)){
                filteredCar.add(eachCar);
            }
        }

        return filteredCar;
    }


}
