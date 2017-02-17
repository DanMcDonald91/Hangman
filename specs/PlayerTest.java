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
  public void canLoseLife() {
    assertEquals(5, player.loseLife());
  }
}