package CalculationExample.Strategy;

public class SubtractOperation implements Strategy {
    public int doOperation(int a, int b) {
        return a-b;
    }
}
