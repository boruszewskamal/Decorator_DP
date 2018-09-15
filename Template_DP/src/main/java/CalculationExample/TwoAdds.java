package CalculationExample;

public class TwoAdds extends Calculation {
    public int calculation1(int a, int b) {
        return add(a,b);
    }

    public int calculation2(int a, int b) {
        return add(a,b);
    }

    private int add(int a, int b) {
        return a + b;
    }
}
