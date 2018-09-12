package com.boruszewska.decoratordp.ShapeService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CircleTest {

  private static final String DRAW_CIRCLE_TEXT = "Let's draw a circle!";
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  private Shape circle;

  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));

    circle = new Circle();
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void drawCircle() {
    circle.draw();
    assertEquals(DRAW_CIRCLE_TEXT, outContent.toString());
  }
}