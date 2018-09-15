package AnimalsExample.Context;

import AnimalsExample.MoveStrategy.Move;
import AnimalsExample.SoundStrategy.Sound;

public class AnimalContext {
    private Move move;
    private Sound sound;

    public AnimalContext(Move move, Sound sound) {
        this.move = move;
        this.sound = sound;
    }

    public String getSound(){
        return sound.sound();
    }

    public String getMove(){
        return move.move();
    }
}

