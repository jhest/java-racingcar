package racing;

import java.util.*;

public class GameMain {

    public static void main(String[] args) {

        //게임 데이터 입력
        Data data = InputView.userInputName();

        //자동차 생성
        List<Car> cars = Car.generateNamedCar(data);

        //게임 진행 & 상태 출력
        Racing.goRacing(cars, data);

        //우승자 출력
        ResultView.raceResult(cars);
    }
}
