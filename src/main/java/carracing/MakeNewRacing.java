package carracing;

import java.util.ArrayList;
import java.util.List;

public class MakeNewRacing {
    private CarInputCreator carInputCreator;
    private DoRacing doRacing;
    public void startNewGame() {
        carInputCreator = new CarInputCreator();
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = carInputCreator.readLineMethod();
        String[] splitCarNames = carInputCreator.makeCarSplit(carNames);

        System.out.println("시도할 회수는 몇회인가요?");
        String tryTimes = carInputCreator.readLineMethod();
        int intTryTimes = carInputCreator.getTryTimes(tryTimes);


        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < splitCarNames.length; i++) {
            Car car = new Car(splitCarNames[i]);
            carList.add(car);
        }

        doRacing = new DoRacing(carList, intTryTimes);
    }
}
