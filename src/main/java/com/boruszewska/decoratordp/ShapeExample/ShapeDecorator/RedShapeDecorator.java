package com.boruszewska.decoratordp.ShapeExample.ShapeDecorator;

import com.boruszewska.decoratordp.ShapeExample.ShapeService.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        drawRedShape();
    }

    private void drawRedShape() {
        System.out.print("\nLet's draw this shape in red!");
    }


}
