package racing;

import java.util.List;
import java.util.Random;

public class Racing {

    public static void goRacing(List<Car> cars, Data data) {
        int trials = data.trialData();
        System.out.println("\n실행 결과");
        for (int i = 0; i < trials; i++) {
            drive(cars);
            System.out.println();
        }
    }

    private static void drive(List<Car> cars) {
        for (Car car : cars) {
            car.move(random());
            System.out.println(car.carName() + ": " + ResultView.status(car));
        }
    }

    public static int random() {
        return new Random().nextInt(9);
    }
}
