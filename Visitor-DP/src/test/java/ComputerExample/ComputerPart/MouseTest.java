package ComputerExample.ComputerPart;

import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class MouseTest {

  Mouse computerPart;
  @Mock ComputerPartVisitor computerPartVisitor;

  @Before
  public void setUp() {
    computerPart = new Mouse();
    MockitoAnnotations.initMocks(this);

    when(computerPartVisitor.visit(computerPart)).thenReturn(anyString());
  }

  @Test
  public void accept() {
    computerPart.accept(computerPartVisitor);
    verify(computerPartVisitor, times(1)).visit(computerPart);
  }
}
