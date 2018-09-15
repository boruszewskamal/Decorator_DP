package CalculationExample.Strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddOperationTest {

  Strategy addOperation;

  @Before
  public void setUp(){
    addOperation = new AddOperation();
  }

  @Test
  public void doOperationReturn2() {
    assertEquals(2, addOperation.doOperation(1,1));
  }
}