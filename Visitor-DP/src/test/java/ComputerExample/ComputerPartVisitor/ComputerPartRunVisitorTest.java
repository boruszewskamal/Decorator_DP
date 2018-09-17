package ComputerExample.ComputerPartVisitor;

import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerPartRunVisitorTest {

  ComputerPartVisitor computerPartVisitor;

  @Before
  public void setUp() {
    computerPartVisitor = new ComputerPartRunVisitor();
  }

  @Test
  public void visitMouse() {
    assertEquals("Let's run the mouse",computerPartVisitor.visit(new Mouse()));
  }

  @Test
  public void visitKeyboard() {
    assertEquals("Let's run the keyboard",computerPartVisitor.visit(new Keyboard()));
  }
}