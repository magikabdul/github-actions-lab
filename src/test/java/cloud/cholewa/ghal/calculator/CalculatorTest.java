package cloud.cholewa.ghal.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        var calculator = new Calculator(10, 5);

        var result = calculator.add((a, b) -> calculator.add(Double::sum));

        assertThat(result)
                .isEqualTo(15);
    }

}
