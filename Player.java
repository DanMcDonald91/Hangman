public class Player {
 private int lives;

 public Player() {
  this.lives = 6;
 }

 public int getLives() {
  return this.lives;
 }

public void loseLife() {
  this.lives -= 1;
}
}