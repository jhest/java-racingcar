package racing;

public class Data {

    private int cars;
    private String[] names;
    private final int trials;

    public Data(int cars, int trials) {
        this.cars = cars;
        this.trials = trials;
    }

    public Data(String[] names, int trials) {
        this.names = names;
        this.trials = trials;
    }

    public int carData() {
        return cars;
    }

    public int trialData() {
        return trials;
    }

    public String[] nameData() {
        return names;
    }
}
