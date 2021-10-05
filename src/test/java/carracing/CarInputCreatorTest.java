package carracing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarInputCreatorTest {

    @Test
    @DisplayName("자동차 이름 붙이기")
    void createCars() {
        String carNames = "pobi,crong,honux";
        CarInputCreator carInputCreator = new CarInputCreator();
        String[] splitCars = carInputCreator.makeCarSplit(carNames);

        Assertions.assertThat(splitCars).isEqualTo(new String[]{"pobi", "crong", "honux"});
    }

    @Test
    @DisplayName("자동차 이름 붙이기 (5자 초과)")
    void createCarsLengthFiveOver() {
        String carNames = "pobi,crong,honuxx";
        CarInputCreator carInputCreator = new CarInputCreator();

        Assertions.assertThatThrownBy(() -> carInputCreator.makeCarSplit(carNames)).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("자동차 이름 붙이기 (null)")
    void createCarsLengthZero() {
        String carNames = "";
        CarInputCreator carInputCreator = new CarInputCreator();

        Assertions.assertThatThrownBy(() -> carInputCreator.makeCarSplit(carNames)).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("시도횟수 숫자 아님")
    void tryTimesNotInteger() {
        String tryTimes = "a";
        CarInputCreator carInputCreator = new CarInputCreator();

        Assertions.assertThatThrownBy(() -> carInputCreator.getTryTimes(tryTimes)).isInstanceOf(IllegalArgumentException.class);
    }

}
