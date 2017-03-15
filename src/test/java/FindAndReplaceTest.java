import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest{

@Test
  // public void wordReplace_returnsPhrase_Phrase() {
  //     FindAndReplace newGame = new FindAndReplace();
  //     String expected = "this is the phrase";
  //     assertEquals(expected, newGame.wordReplace("this is the phrase", "", ""));
  //   }

    public void wordReplace_returnsPhrase_Phrase() {
        FindAndReplace newGame = new FindAndReplace();
        String expected = "this is the phrase";
        assertTrue(newGame.wordReplace("this is the phrase", "", "") instanceOf String );
      }

    @Test
      public void wordReplace_returnsWord_Word() {
          FindAndReplace newGame = new FindAndReplace();
          String expected = "this is the purple in the phrase";
          assertNotEquals(expected, newGame.wordReplace("this is the word in the phrase", "word", "purple"));
        }
//after you have written replace code

    @Test
      public void wordReplace_returnsWord_Word() {
          FindAndReplace newGame = new FindAndReplace();
          String expected = "this is the purple in the phrase";
          assertEquals(expected, newGame.wordReplace("this is the word in the phrase", "word", "purple"));
        }



}
