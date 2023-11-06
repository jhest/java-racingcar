package racing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static racing.ResultView.winner;

public class RacingTest {

    @Test
    void 자동차_생성() {
        List<Car> cars = Car.generateCar(3);
        int number_0 = cars.get(0).carNumber();
        int number_1 = cars.get(1).carNumber();
        int number_2 = cars.get(2).carNumber();
        int distance = cars.get(0).carDistance();

        assertThat(number_0).isEqualTo(0);
        assertThat(number_1).isEqualTo(1);
        assertThat(number_2).isEqualTo(2);
        assertThat(distance).isEqualTo(0);
    }

    @Test
    void Random_정수_생성() {
        int random = Racing.random();
//        System.out.println("random = " + random);
        assertThat(random).isLessThanOrEqualTo(9);
    }

    @Test
    void 자동차_전진() {
        Car car1 = new Car(1);
        car1.move(5);
        int distance1 = car1.carDistance();
        assertThat(distance1).isEqualTo(1);

        Car car2 = new Car(2);
        car2.move(3);
        int distance2 = car2.carDistance();
        assertThat(distance2).isEqualTo(0);
    }

    @Test
    void 게임_진행() {
        List<Car> cars = new  ArrayList<>();
        cars.add(new Car(1));
        Data data = new Data(new String[]{"test1"}, 5);
        Racing.goRacing(cars,data);
        int distance = cars.get(0).carDistance();
//        System.out.println("distance = " + distance);
        assertThat(distance).isLessThanOrEqualTo(5);
    }

    @Test
    void 입력이름_분리() {
        String inputNames = "a,b,c";
        String[] names = inputNames.split(",");
        assertThat(names[0]).isEqualTo("a");
    }

    @Test
    void 자동차_이름_부여_생성() {
        Data data = new Data(new String[]{"test1"}, 5);
        List<Car> cars = Car.generateNamedCar(data);
        String name = cars.get(0).carName();
        assertThat(name).isEqualTo("test1");
    }

    @Test
    void 우승자_출력() {
        Car test1 = new Car("test1");
        Car test2 = new Car("test2");
        test1.move(5);
        test2.move(3);
        List<Car> cars = new ArrayList<>();
        cars.add(test1);
        cars.add(test2);
        List<String> winner = winner(cars);
        assertThat(winner.get(0)).isEqualTo("test1");
    }
}
