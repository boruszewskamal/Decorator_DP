package com.boruszewska.decoratordp.ShapeService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SquareTest {

  private static final String DRAW_SQUARE_TEXT = "Let's draw a square!";
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  private Shape square;
  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));

    square = new Square();
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }
  @Test
  public void drawSquare() {
    square.draw();
    assertEquals(DRAW_SQUARE_TEXT, outContent.toString());
  }
}