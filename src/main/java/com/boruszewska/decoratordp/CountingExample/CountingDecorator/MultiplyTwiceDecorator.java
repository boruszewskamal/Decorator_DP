package com.boruszewska.decoratordp.CountingExample.CountingDecorator;

import com.boruszewska.decoratordp.CountingExample.CountingService.Counting;

public class MultiplyTwiceDecorator extends CountingDecorator{
    public MultiplyTwiceDecorator(Counting counting) {
        super(counting);
    }

    @Override
    public int count() {
        return multiplyTwice(super.count());
    }

    private int multiplyTwice(int count) {
        return count * 2;
    }
}
