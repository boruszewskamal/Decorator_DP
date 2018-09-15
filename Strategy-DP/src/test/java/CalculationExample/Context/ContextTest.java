package CalculationExample.Context;

import CalculationExample.Strategy.AddOperation;
import CalculationExample.Strategy.SubtractOperation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

  Context context;

  @Test
  public void runAddingStrategy() {
    context = new Context(new AddOperation());
    assertEquals(2, context.runStrategy(1,1));
  }

  @Test
  public void runSubtractStrategy(){
    context = new Context(new SubtractOperation());
    assertEquals(2,context.runStrategy(4,2));
  }
}