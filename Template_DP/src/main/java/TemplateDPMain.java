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
  }
}
