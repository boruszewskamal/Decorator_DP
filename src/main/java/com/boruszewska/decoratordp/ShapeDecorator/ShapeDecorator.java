package com.boruszewska.decoratordp.ShapeDecorator;

import com.boruszewska.decoratordp.ShapeService.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
