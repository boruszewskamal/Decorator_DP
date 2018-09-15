package CalculationExample;

public abstract class Calculation {
    abstract int calculation1(int a, int b);
    abstract int calculation2(int a, int b);

    public int makeCalculation(int a, int b){
        return calculation1(calculation2(a,b),a);
    }
}
