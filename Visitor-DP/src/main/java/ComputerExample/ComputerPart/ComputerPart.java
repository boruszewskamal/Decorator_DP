package ComputerExample.ComputerPart;

import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;

public interface ComputerPart {
  void accept(ComputerPartVisitor computerPartVisitor);
}
