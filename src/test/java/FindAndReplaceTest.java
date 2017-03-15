import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest{

  @Test
    public void wordReplace_returnsSingleWord_Word() {
        FindAndReplace newGame = new FindAndReplace();
        String expected = "word";
        assertEquals(expected, newGame.wordReplace("word", "", ""));
        assertTrue(newGame.wordReplace("word", "", "") instanceof String );
    }

  @Test
    public void wordReplace_returnsPhraseWithReplacement_Phrase() {
        FindAndReplace newGame = new FindAndReplace();
        String expected = "this is the purple in the phrase";
        assertEquals(expected, newGame.wordReplace("this is the word in the phrase", "word", "purple"));
    }
  @Test
    public void wordReplace_returnsPhraseWithMoreReplacement_Phrase() {
        FindAndReplace newGame = new FindAndReplace();
        String expected = "this is the purple in the purple";
        assertEquals(expected, newGame.wordReplace("this is the word in the word", "word", "purple"));
    }



}
