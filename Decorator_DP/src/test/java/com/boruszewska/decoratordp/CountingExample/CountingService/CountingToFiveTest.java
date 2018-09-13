package com.boruszewska.decoratordp.CountingExample.CountingService;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingToFiveTest {

  Counting countingToFive;

  @Before
  public void setUp(){
    countingToFive = new CountingToFive();
  }

  @Test
  public void count() {
    assertEquals(5,countingToFive.count());
  }
}