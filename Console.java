 import java.util.Scanner;
public class Console {

  Scanner sc;
  String data;


  public void start() {
    System.out.print("Please enter the word:");
    sc = new Scanner(System.in);
    data = sc.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Word hiddenWord = new Word(data);
     System.out.println(hiddenWord.hide());

    // #Takes the word into the system and passes it out

     System.out.println("Guess a letter");
  }


}