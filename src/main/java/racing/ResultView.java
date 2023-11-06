package racing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ResultView {

    public static String status(Car car) {
        StringBuilder status = new StringBuilder();
        for (int i = 0; i < car.carDistance(); i++) {
            status.append("-");
        }
        return status.toString();
    }

    public static List<String> winner(List<Car> cars) {
        List<Integer> distance = new ArrayList<>();
        for (Car car : cars) {
            distance.add(car.carDistance());
        }
        distance.sort(Comparator.reverseOrder());
        Integer winDistance = distance.get(0);

        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.carDistance() == winDistance) {
                winner.add(car.carName());
            }
        }

        return winner;
    }

    public static void raceResult(List<Car> cars) {
        List<String> winners = winner(cars);
        String str = winners.toString();
        System.out.println(str.substring(1, str.length() - 1) + "가 최종 우승하였습니다.");
    }
}
