package com.boruszewska.decoratordp.ShapeExample.ShapeDecorator;

import com.boruszewska.decoratordp.ShapeExample.ShapeService.Circle;
import com.boruszewska.decoratordp.ShapeExample.ShapeService.Shape;
import com.boruszewska.decoratordp.ShapeExample.ShapeService.Square;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedShapeDecoratorTest {

  private static final String DRAW_CIRCLE_TEXT = "Let's draw a circle!";
  private static final String DRAW_SQUARE_TEXT = "Let's draw a square!";
  private static final String DRAW_RED_CIRCLE_TEXT = "\nLet's draw this shape in red!";
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  private Shape redShape;

  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));

  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void drawRedCircle() {
    redShape = new RedShapeDecorator(new Circle());
    redShape.draw();
    assertEquals(DRAW_CIRCLE_TEXT+DRAW_RED_CIRCLE_TEXT, outContent.toString());
  }

  @Test
  public void drawRedSquare() {
    redShape = new RedShapeDecorator(new Square());
    redShape.draw();
    assertEquals(DRAW_SQUARE_TEXT+DRAW_RED_CIRCLE_TEXT, outContent.toString());
  }
}