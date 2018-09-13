package GameExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FootballTest {
    private static final String INIT_FOOTBALL_TEXT = "Init football game\n";
    private static final String PLAY_FOOTBALL_TEXT = "Start football game\n";
    private static final String END_FOOTBALL_TEXT = "End football game\n";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Game football;
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));

        football = new Football();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void initialize() {
        football.initialize();
        assertEquals(INIT_FOOTBALL_TEXT, outContent.toString());
    }

    @Test
    public void startPlay() {
        football.startPlay();
        assertEquals(PLAY_FOOTBALL_TEXT, outContent.toString());
    }

    @Test
    public void endPlay() {
        football.endPlay();
        assertEquals(END_FOOTBALL_TEXT, outContent.toString());
    }

    @Test
    public void play(){
        football.play();
        assertEquals(INIT_FOOTBALL_TEXT+PLAY_FOOTBALL_TEXT+END_FOOTBALL_TEXT, outContent.toString());
    }
}