package racing.data;

public class Car {

    private int number;
    private int distance;

    public Car() {
        this.distance = 0;
    }

    public void initNumber(int nm) {
        number = nm;
    }

    public int carNumber() {
        return number;
    }

    public int distanceStat() {
        return distance;
    }

    public void move(int drive) {
        distance += drive;
    }
}
