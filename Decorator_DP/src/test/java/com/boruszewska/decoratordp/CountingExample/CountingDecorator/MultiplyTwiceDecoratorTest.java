package com.boruszewska.decoratordp.CountingExample.CountingDecorator;

import com.boruszewska.decoratordp.CountingExample.CountingService.Counting;
import com.boruszewska.decoratordp.CountingExample.CountingService.CountingToSix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTwiceDecoratorTest {

  Counting twiceCounting;

  @Before
  public void setUp(){
    twiceCounting = new MultiplyTwiceDecorator(new CountingToSix());
  }

  @Test
  public void count() {
    assertEquals(12,twiceCounting.count());
  }
}