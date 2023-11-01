package racing;

import racing.data.Game;

import java.util.Scanner;

public class DataInput {

    public Game input() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int cars = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int trials = scanner.nextInt();

        Game data = new Game();
        data.initData(cars, trials);

        return data;
    }

}
