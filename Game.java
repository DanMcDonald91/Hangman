
import java.util.Scanner;


public class Game {

  Scanner sc;

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

public String newGuess() {
System.out.println("Guess a letter");
sc = new Scanner(System.in);
String letter = sc.nextLine();
return letter;
}

}