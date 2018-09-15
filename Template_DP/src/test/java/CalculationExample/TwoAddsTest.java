package CalculationExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoAddsTest {

  Calculation twoAdds;

  @Before
  public void setUp() throws Exception {
    twoAdds = new TwoAdds();
  }

  @Test
  public void calculation1Equals3() {
    assertEquals(3,twoAdds.calculation1(1,2));
  }

  @Test
  public void calculation2Equals3() {
    assertEquals(3,twoAdds.calculation1(1,2));
  }

  @Test
  public void calculateFromAbstractEquals4(){
    assertEquals(4,twoAdds.makeCalculation(1,2));
  }
}