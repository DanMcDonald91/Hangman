public class Game {

private int correctGuesses;

public Game() {
  this.correctGuesses = 0;
}

public int getCorrectGuesses() {
  return this.correctGuesses;
}

public void addCorrectGuess() {
  this.correctGuesses += 1;
}
}