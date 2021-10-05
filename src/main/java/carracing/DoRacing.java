package carracing;

import java.util.List;

public class DoRacing {
    private List<Car> carList;
    private int tryTimes;
    public DoRacing(List<Car> carList, int tryTimes) {
        this.carList = carList;
        this.tryTimes = tryTimes;
        System.out.println("실행 결과");
        for(int i = 0 ; i < tryTimes ; i++) {
            printRace(carList);
            System.out.println();
        }
    }

    private void printRace(List<Car> carList) {
        for (int i = 0 ; i < carList.size() ; i++) {
            System.out.println(carList.get(i).getCarName()+" : "+carList.get(i).getCurrentPositionString());
        }
    }




}
