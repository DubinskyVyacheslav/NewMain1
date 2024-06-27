package homework8;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        String car = "Машина";
//        String car1 = "Машина";
//
//        System.out.println(car.hashCode());
//        System.out.println(car1.hashCode());
//
//        Map<Integer,String> map = new HashMap<>();
//
//        map.put(1,car);
//        map.put(2,car1);
//
//        System.out.println(map);
//
//        System.out.println(map.size());
//
//        System.out.println(map.get(2));


        Car firstMinivan = new Minivan("Volkswagen","1",7,"1","green");
        Car secondMinivan = new Minivan("Volkswagen","2",4,"2","Orange");
        Car thirdMinivan = new Minivan("Volkswagen","3",3,"3","Red");

        Car firstCabriolet = new Cabriolet("BMW ","1",2,"1","Orange");
        Car secondCabriolet  = new Cabriolet("BMW ","2",7,"2","Red");
        Car thirdCabriolet = new Cabriolet("BMW ","3",8,"3","green");

        Car firstPickup  = new Pickup("Toyota ","1",9,"1","Red");
        Car secondPickup = new Pickup("Toyota ","2",11,"2","green");
        Car thirdPickup = new Pickup("Toyota ","3",16,"3","Orange");

        System.out.println(firstPickup.toString());
        System.out.println(firstCabriolet.toString());

        Garage garage = new Garage();

        garage.setCar(firstPickup,1);
        garage.setCar(secondPickup,2);
        garage.setCar(thirdPickup,3);

        garage.setCar(firstCabriolet,4);
        garage.setCar(secondCabriolet,5);
        garage.setCar(thirdCabriolet,6);

        garage.setCar(firstMinivan,7);
        garage.setCar(secondMinivan,8);
        garage.setCar(thirdMinivan,9);

        System.out.println(garage.toString());

//       garage.deleteCar(thirdPickup,3);
//
//        System.out.println(garage.toString());




    }
}
