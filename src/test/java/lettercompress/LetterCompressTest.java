package lettercompress;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple LetterCompress.
 */
public class LetterCompressTest
{

    @Test
    public void testaabcccccaaa() {

        //Set
        LetterCompress lc= new LetterCompress();
        String input = "aabcccccaaa";

        //Test
        String output = lc.toAlternativeString(input);

        //Assert

        assertEquals("a5b1c5",output);
    }
}
