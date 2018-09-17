package ComputerExample.ComputerPartVisitor;

import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerPartDisplayVisitorTest {

  ComputerPartVisitor computerPartVisitor;

  @Before
  public void setUp() {
    computerPartVisitor = new ComputerPartDisplayVisitor();
  }

  @Test
  public void visitMouse() {
    assertEquals("Hi from mouse",computerPartVisitor.visit(new Mouse()));
  }

  @Test
  public void visitKeyboard() {
    assertEquals("Hi from keyboard",computerPartVisitor.visit(new Keyboard()));
  }
}
