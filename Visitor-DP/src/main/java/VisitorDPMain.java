import ComputerExample.ComputerPart.ComputerPart;
import ComputerExample.ComputerPart.Keyboard;
import ComputerExample.ComputerPart.Mouse;
import ComputerExample.ComputerPartVisitor.ComputerPartDisplayVisitor;
import ComputerExample.ComputerPartVisitor.ComputerPartRunVisitor;
import ComputerExample.ComputerPartVisitor.ComputerPartVisitor;

public class VisitorDPMain {
  public static void main(String[] args) {
      ComputerPart[] computerParts = {new Keyboard(), new Mouse()};
      ComputerPartVisitor computerPartRunVisitor = new ComputerPartRunVisitor();
      ComputerPartVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();

      for (ComputerPart computerPart : computerParts){
          computerPart.accept(computerPartRunVisitor);
          computerPart.accept(computerPartDisplayVisitor);
      }
  }
}
