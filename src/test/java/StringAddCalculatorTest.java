import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {

    StringAddCalculator stringAddCalculator;
    @Test
    void return_null_when_0() {
        stringAddCalculator = new StringAddCalculator("0");
        int result = stringAddCalculator.splitAndSum();
        Assertions.assertThat(result).isEqualTo(0);

        stringAddCalculator = new StringAddCalculator("");
        result = stringAddCalculator.splitAndSum();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void return_one_number() {
        stringAddCalculator = new StringAddCalculator("1");
        int result = stringAddCalculator.splitAndSum();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void return_comma_or_colon_number_sum() {
        stringAddCalculator = new StringAddCalculator("1,2:3");
        int result = stringAddCalculator.splitAndSum();
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void throw_exception_negative_number() {
        Assertions.assertThatThrownBy(() -> new StringAddCalculator("-1,2:3")).isInstanceOf(RuntimeException.class);
    }

}
