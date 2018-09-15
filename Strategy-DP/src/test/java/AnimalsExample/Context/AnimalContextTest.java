package AnimalsExample.Context;

import AnimalsExample.MoveStrategy.Flight;
import AnimalsExample.MoveStrategy.Walk;
import AnimalsExample.SoundStrategy.Bark;
import AnimalsExample.SoundStrategy.Meow;
import AnimalsExample.SoundStrategy.Tweet;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalContextTest {

  AnimalContext animal;

  @Test
  public void getSoundFromDog() {
    animal = new AnimalContext(new Walk(), new Bark());
    assertEquals("bark",animal.getSound());
  }

  @Test
  public void getMoveFromDog() {
    animal = new AnimalContext(new Walk(), new Bark());
    assertEquals("walk",animal.getMove());
  }

  @Test
  public void getSoundFromCat(){
    animal = new AnimalContext(new Walk(), new Meow());
    assertEquals("meow",animal.getSound());
  }

  @Test
  public void getMoveFromBird(){
    animal = new AnimalContext(new Flight(), new Tweet());
    assertEquals("tweet",animal.getSound());
  }
}