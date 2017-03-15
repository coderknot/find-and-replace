import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FindAndReplace{

  public String wordReplace(String phrase, String word, String replacementWord) {
    String returnPhrase = phrase;
    String[] phraseArray = phrase.split(" ");
    List phraseList = new ArrayList(Arrays.asList(phraseArray));

    String returnWord = "";
    if(phraseList.contains(word)){
      for( int i = 0; i< phraseList.size(); i++) {
        if(i == phraseList.indexOf(word)) {
          phraseList.set( phraseList.indexOf(word), replacementWord);
        }
      }
      returnPhrase = String.join(" ", phraseList);
    } else {
    returnPhrase = phrase;

    }
    return returnPhrase;
  }

}
