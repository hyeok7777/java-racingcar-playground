package carracing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void makeNewCar() {
        Car car = new Car("pobi");

        Assertions.assertThat(car.getCarName()).isEqualTo("pobi");
    }

    @Test
    void setCurrentPosition() {
        Car car = new Car("pobi");
        //car.setCurrentPosition(4);
        Assertions.assertThat(car.getCurrentPosition()).isEqualTo(4);
    }
}
