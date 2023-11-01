package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.data.Car;
import racing.data.Game;

import java.util.List;


class RacingMainTest {

    @Test
    void generateCars() {
        Game data = new Game();
        data.initData(3, 5);

        List<Car> cars = RacingMain.generateCars(data);

        Assertions.assertThat(cars).hasSize(3);
        Assertions.assertThat(cars.get(0).carNumber()).isEqualTo(0);
        Assertions.assertThat(cars.get(0).distanceStat()).isEqualTo(0);
    }

    @Test
    void goRacing() {
        Game data = new Game();
        data.initData(3, 5);

        List<Car> cars = RacingMain.generateCars(data);
        RacingMain.goRacing(data, cars);

        Assertions.assertThat(cars.get(0).distanceStat()).isLessThanOrEqualTo(5);
        Assertions.assertThat(cars.get(1).distanceStat()).isLessThanOrEqualTo(5);
        Assertions.assertThat(cars.get(2).distanceStat()).isLessThanOrEqualTo(5);
    }
}