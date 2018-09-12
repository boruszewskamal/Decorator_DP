package com.boruszewska.decoratordp;

import com.boruszewska.decoratordp.ShapeDecorator.RedShapeDecorator;
import com.boruszewska.decoratordp.ShapeService.Circle;
import com.boruszewska.decoratordp.ShapeService.Shape;
import com.boruszewska.decoratordp.ShapeService.Square;

import java.util.ArrayList;
import java.util.List;

public class DecoratorDpApplication {

  public static void main(String[] args) {

    List<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Circle());
    shapes.add(new RedShapeDecorator(new Circle()));
    shapes.add(new RedShapeDecorator(new Square()));

    shapes.stream().forEach(shape -> shape.draw());
  }
}
