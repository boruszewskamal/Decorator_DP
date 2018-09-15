import CalculationExample.Calculation;
import CalculationExample.TwoAdds;
import CalculationExample.TwoMultiplies;
import GameExample.Cricket;
import GameExample.Football;
import GameExample.Game;

public class TemplateDPMain {

  public static void main(String[] args) {
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();

      Calculation calculation = new TwoAdds();
      System.out.print(calculation.makeCalculation(1,2));
      System.out.println();
      calculation = new TwoMultiplies();
      System.out.print(calculation.makeCalculation(1,2));
  }
}
