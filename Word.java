public class Word {
   private String word;
  private StringBuilder hiddenWord;

  public Word(String word) {

    this.word = word;
 }

 public String hide() {
  hiddenWord = new StringBuilder();
  for (char character : word.toCharArray()){
    hiddenWord.append("*");  
  }

 return hiddenWord.toString();

 //    // #taking the word we passed in and converting it into array of single characters
 // "bird" into [b, i, r, d]  

 // append is adding asterixs 
}


}
