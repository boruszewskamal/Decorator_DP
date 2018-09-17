package ComputerExample.ComputerPart;

import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
