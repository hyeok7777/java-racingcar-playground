package carracing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarInputCreator {


    private static boolean isNameNull(String carNames) {
        if (carNames.length() == 0) {
            return true;
        }
        return false;
    }

    private static boolean checkNameLength(String[] splitCarNames) {
        List<String> listStream = Arrays.stream(splitCarNames).filter(c -> c.length() > 5).collect(Collectors.toList());
        if (!listStream.isEmpty()) {
            return true;
        }
        return false;
    }

    public String[] makeCarSplit(String carNames) {
        if (isNameNull(carNames)) {
            throw new RuntimeException("이름이 공란입니다.");
        }

        String[] splitCarNames = carNames.split(",");
        if (checkNameLength(splitCarNames)) {
            throw new RuntimeException("자동차 이름은 5글자 이하여야 합니다. ");
        }

        return splitCarNames;
    }

    public int getTryTimes(String tryTimes) {
        if(isInteger(tryTimes)) {
            throw new IllegalArgumentException("숫자를 입력하세요. ");
        }
        return Integer.parseInt(tryTimes);
    }

    private boolean isInteger(String tryTimes) {
        if(!tryTimes.matches("-?\\d+")) {
            return true;
        }
        return false;
    }

    public String readLineMethod() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }
}
