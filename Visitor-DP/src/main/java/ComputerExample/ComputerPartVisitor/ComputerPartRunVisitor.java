package ComputerExample.ComputerPartVisitor;

import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;

public class ComputerPartRunVisitor implements ComputerPartVisitor {
  public String visit(Keyboard keyboard) {
    return "Let's run the keyboard";
  }

  public String visit(Mouse mouse) {
    return "Let's run the mouse";
  }
}
