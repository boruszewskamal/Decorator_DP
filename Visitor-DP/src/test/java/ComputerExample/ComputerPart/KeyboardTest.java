package ComputerExample.ComputerPart;

import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class KeyboardTest {

  Keyboard computerPart;
  @Mock ComputerPartVisitor computerPartVisitor;

  @Before
  public void setUp() {
    computerPart = new Keyboard();
    MockitoAnnotations.initMocks(this);

    when(computerPartVisitor.visit(computerPart)).thenReturn(anyString());
  }

  @Test
  public void accept() {
    computerPart.accept(computerPartVisitor);
    verify(computerPartVisitor, times(1)).visit(computerPart);
  }
}
