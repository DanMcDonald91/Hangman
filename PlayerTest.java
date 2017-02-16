import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

  Player player;

  @Before
  public void setup() {
    player = new Player();
  }

  @Test
  public void canGetLives() {
    assertEquals(6, player.getLives());

  }

  @Test
  public void canLoseLife() {
    player.loseLife();
    assertEquals(5, player.getLives());
  }
}