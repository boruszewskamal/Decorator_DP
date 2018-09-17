package ComputerExample.ComputerPartVisitor;

import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
  public String visit(Keyboard keyboard) {
    return "Hi from keyboard";
  }

  public String visit(Mouse mouse) {
    return "Hi from mouse";
  }
}
