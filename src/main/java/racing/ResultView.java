package racing;

import racing.data.Car;

public class ResultView {

    public String racingResult(Car car) {
        String result = "";
        for (int i = 0; i < car.distanceStat(); i++) {
            result += "-";
        }
        return result;
    }
}
