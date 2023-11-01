package racing;

import racing.data.Car;
import racing.data.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingMain {

    public static void main(String[] args) {

        //게임 데이터 확인
        DataInput dataInput = new DataInput();
        Game data = dataInput.input();

        //경주 자동차 생성
        List<Car> cars = generateCars(data);

        //게임 실행
        goRacing(data, cars);
    }

    public static List<Car> generateCars(Game data) {
        List<Car> cars = new ArrayList<>();
        for (int c = 0; c < data.cars(); c++) {
            Car car = new Car();
            car.initNumber(c);
            cars.add(car);
        }
        return cars;
    }

    public static void goRacing(Game data, List<Car> cars) {
        System.out.println("실행 결과");
        for (int i = 0; i < data.trials(); i++) {
            for (Car car : cars) {
                Random random = new Random();
                if (random.nextInt(9) > 3) {
                    car.move(1);
                }
                ResultView resultView = new ResultView();
                System.out.println("C" + (car.carNumber() + 1) + ": " + resultView.racingResult(car));
            }
            System.out.println();
        }
    }
}
