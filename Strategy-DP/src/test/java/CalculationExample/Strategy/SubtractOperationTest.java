package CalculationExample.Strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractOperationTest {

  Strategy subtractOperation;

  @Before
  public void setUp() throws Exception {
    subtractOperation = new SubtractOperation();
  }

  @Test
  public void doOperationReturn2() {
    assertEquals(2,subtractOperation.doOperation(4,2));
  }
}