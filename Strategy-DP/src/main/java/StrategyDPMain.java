import CalculationExample.Context.Context;
import CalculationExample.Strategy.AddOperation;
import CalculationExample.Strategy.SubtractOperation;

public class StrategyDPMain {
  public static void main(String[] args) {
      Context context = new Context(new AddOperation());
      System.out.println(context.runStrategy(1,2));
      context = new Context(new SubtractOperation());
      System.out.println(context.runStrategy(1,2));
  }
}
