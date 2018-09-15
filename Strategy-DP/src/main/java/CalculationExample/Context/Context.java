package CalculationExample.Context;

import CalculationExample.Strategy.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int runStrategy(int a, int b){
        return strategy.doOperation(a,b);
    }
}
