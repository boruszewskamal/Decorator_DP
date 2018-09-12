package com.boruszewska.decoratordp;

import com.boruszewska.decoratordp.ShapeDecorator.RedShapeDecorator;
import com.boruszewska.decoratordp.ShapeService.Circle;
import com.boruszewska.decoratordp.ShapeService.Shape;
import com.boruszewska.decoratordp.ShapeService.Square;

public class DecoratorDpApplication {

  public static void main(String[] args) {

    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());

    Shape redSquare = new RedShapeDecorator(new Square());
    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nSquare of red border");
    redSquare.draw();
  }
}
