package racing.data;

public class Game {

    private int cars;
    private int trials;

    public void initData(int cars, int trials) {
        this.cars = cars;
        this.trials = trials;
    }

    public int cars() {
        return cars;
    }

    public int trials() {
        return trials;
    }
}
