package racing;

import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class InputView {

    public static Data userInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int cars = scanner.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int trials = scanner.nextInt();

        return new Data(cars, trials);
    }

    public static Data userInputName() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        String[] names = splitNames(scanner);
        while (lengthCheck(names)) {
            names = splitNames(scanner);
        }

        System.out.println("시도할 횟수는 몇 회 인가요?");
        int trials = scanner.nextInt();

        return new Data(names, trials);
    }

    private static String[] splitNames(Scanner scanner) {
        String inputNames = scanner.nextLine();
        return inputNames.split(",");
    }

    private static Boolean lengthCheck(String[] names) {
        for (String name : names) {
            return check(name);
        }
        return FALSE;
    }

    private static Boolean check(String name) {
        if (name.length() > 5) {
            System.out.println("자동차 이름은 5자 이하로 입력하세요.");
            return TRUE;
        }
        return FALSE;
    }
}
