package homework8;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car,Integer> garage = new HashMap<>();

    public void setCar(Car car,Integer integer){
        garage.put(car,integer);
    }

    public void deleteCar (Car car, Integer integer){
        garage.remove(car,integer);
    }

    public void howMuchCar(String brand){



    }



    public Map<Car, Integer> getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}';
    }
}
