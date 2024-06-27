package homework8;

import java.util.Objects;

public abstract class Car {

    private String Brand;
    private String model;
    private Integer age;
    private String engine;
    private String color;

    public Car(String brand, String model, Integer age, String engine, String color) {
        Brand = brand;
        this.model = model;
        this.age = age;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(Brand, car.Brand) && Objects.equals(model, car.model) && Objects.equals(age, car.age) && Objects.equals(engine, car.engine) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand, model, age, engine, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

