package racing;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int number;
    private String name;
    private int distance;

    public Car(int number) {
        this.number = number;
        this.distance = 0;
    }

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public static List<Car> generateNamedCar(Data data) {
        String[] names = data.nameData();
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
        return cars;
    }

    public static List<Car> generateCar(int number) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Car car = new Car(i);
            cars.add(car);
        }
        return cars;
    }

    public int carNumber() {
        return number;
    }

    public int carDistance() {
        return distance;
    }

    public String carName() {
        return name;
    }

    public void move(int random) {
        if (random > 3) {
            distance += 1;
        }
    }
}
