public class Word {
 private String word;
 private StringBuilder hiddenWord;
 private String answer;

 public Word(String word) {

  this.word = word;
  this.answer = "Yer ma";
}

public String hide() {
  hiddenWord = new StringBuilder();
  for (char character : word.toCharArray()){
    hiddenWord.append("*");  
  }

  return hiddenWord.toString();
}

 //    // #taking the word we passed in and converting it into array of single characters
 // "bird" into [b, i, r, d]  

 // append is adding asterixs 


public String checkGuess(String s) {
  // char letter = s.charAt(0);
  // for (char c : word.toCharArray()){
    // if (letter == c) {
  if (word.contains(s)){
    answer = "yes";
  }
  else {
    answer = "no";
  }
  return answer;
}

}

