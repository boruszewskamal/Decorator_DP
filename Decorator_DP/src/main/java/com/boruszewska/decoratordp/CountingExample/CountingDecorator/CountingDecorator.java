package com.boruszewska.decoratordp.CountingExample.CountingDecorator;

import com.boruszewska.decoratordp.CountingExample.CountingService.Counting;

public abstract class CountingDecorator implements Counting{
    protected Counting counting;

    public CountingDecorator(Counting counting) {
        this.counting = counting;
    }

    public int count(){
        return counting.count();
    }
}
