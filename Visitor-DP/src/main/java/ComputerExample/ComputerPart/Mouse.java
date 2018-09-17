package ComputerExample.ComputerPart;

import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
