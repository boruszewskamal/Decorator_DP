package com.boruszewska.decoratordp.CountingExample.CountingService;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingToSixTest {
    Counting countingToSix;

    @Before
    public void setUp(){
        countingToSix = new CountingToSix();
    }

    @Test
    public void count() {
        assertEquals(6,countingToSix.count());
    }
}