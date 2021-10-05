package carracing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeNewRacingTest {

    @Test
    void makeNewRacing() {
        CarInputCreator carInputCreator = new CarInputCreator();
        String names = "pobi,crong,honux";
        String[] splitNames = carInputCreator.makeCarSplit(names);

        Car car1 = new Car(splitNames[0]);
        Car car2 = new Car(splitNames[1]);
        Car car3 = new Car(splitNames[2]);

        Assertions.assertThat(car1.getCarName()).isEqualTo("pobi");
        Assertions.assertThat(car2.getCarName()).isEqualTo("crong");
        Assertions.assertThat(car3.getCarName()).isEqualTo("honux");
    }
}
