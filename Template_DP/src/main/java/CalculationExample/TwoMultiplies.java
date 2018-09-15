package CalculationExample;

public class TwoMultiplies extends Calculation {
    public int calculation1(int a, int b) {
        return multiply(a,b);
    }

    public int calculation2(int a, int b) {
        return multiply(a,b);
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
