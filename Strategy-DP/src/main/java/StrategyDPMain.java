import AnimalsExample.Context.AnimalContext;
import AnimalsExample.MoveStrategy.Walk;
import AnimalsExample.SoundStrategy.Bark;
import AnimalsExample.SoundStrategy.Meow;
import CalculationExample.Context.Context;
import CalculationExample.Strategy.AddOperation;
import CalculationExample.Strategy.SubtractOperation;

import java.util.ArrayList;
import java.util.List;

public class StrategyDPMain {
  public static void main(String[] args) {
      Context context = new Context(new AddOperation());
      System.out.println(context.runStrategy(1,2));
      context = new Context(new SubtractOperation());
      System.out.println(context.runStrategy(1,2));

      List<AnimalContext> animals = new ArrayList<>();
      animals.add(new AnimalContext(new Walk(), new Bark()));
      animals.add(new AnimalContext(new Walk(),new Meow()));
      animals.stream()
              .forEach(animal -> System.out.println(animal.getMove()+ " " + animal.getSound()));
  }
}
