package com.boruszewska.decoratordp.ShapeDecorator;

import com.boruszewska.decoratordp.ShapeService.Shape;

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
        System.out.print("Let's draw this shape in red!");
    }


}
