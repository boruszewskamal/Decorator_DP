package ComputerExample.ComputerPartVisitor;

import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;

public interface ComputerPartVisitor {
  String visit(Keyboard keyboard);

  String visit(Mouse mouse);
}
