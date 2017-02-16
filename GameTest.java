import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class GameTest {
  Game game;

  @Before
  public void setup() {
    game = new Game();
  }
 @Test
 public void canGetCorrectGuesses() {
  assertEquals(0, game.getCorrectGuesses());
 }

@Test
public void canAddCorrectGuesses() {
  game.addCorrectGuess();
  assertEquals(1, game.getCorrectGuesses());
}
}

