package CalculationExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoMultipliesTest {

  Calculation twoMultiplies;

  @Before
  public void setUp() throws Exception {
    twoMultiplies = new TwoMultiplies();
  }

  @Test
  public void calculation1Equals2() {
    assertEquals(2,twoMultiplies.calculation1(1,2));
  }

  @Test
  public void calculation2Equals2() {
    assertEquals(2,twoMultiplies.calculation1(1,2));
  }

  @Test
  public void calculateFromAbstractEquals2(){
    assertEquals(2,twoMultiplies.makeCalculation(1,2));
  }
}