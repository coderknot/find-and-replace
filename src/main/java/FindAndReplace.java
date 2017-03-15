import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FindAndReplace{

public String wordReplace(String phrase, String word, String replacementWord) {
  String returnPhrase = phrase;
  String[] phraseArray = phrase.split(" ");
  List phraseList = new ArrayList(Arrays.asList(phraseArray));

  String returnWord = "";

  if(phraseList.contains(word)) {
    returnWord = word;
  } else {
    returnWord = returnPhrase;
  }

  return returnWord;
}

}
