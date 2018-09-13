package GameExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class CricketTest {

  private static final String INIT_CRICKET_TEXT = "Init cricket game\n";
  private static final String PLAY_CRICKET_TEXT = "Start cricket game\n";
  private static final String END_CRICKET_TEXT = "End cricket game\n";
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  private Game cricket;
  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));

    cricket = new Cricket();
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void initialize() {
    cricket.initialize();
    assertEquals(INIT_CRICKET_TEXT, outContent.toString());
  }

  @Test
  public void startPlay() {
    cricket.startPlay();
    assertEquals(PLAY_CRICKET_TEXT, outContent.toString());
  }

  @Test
  public void endPlay() {
    cricket.endPlay();
    assertEquals(END_CRICKET_TEXT, outContent.toString());
  }

  @Test
  public void play(){
    cricket.play();
    assertEquals(INIT_CRICKET_TEXT+PLAY_CRICKET_TEXT+END_CRICKET_TEXT, outContent.toString());
  }
}