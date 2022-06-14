package cloud.cholewa.ghal.calculator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Calculator {

    private final double x;
    private final double y;

    public double add(Sum sum) {
        return sum.add(x, y);
    }
}
