package tests;

import org.junit.jupiter.api.Test;
import questions.QuestionThree;
import questions.QuestionTwo;

import static org.junit.Assert.*;

class QuestionThreeTest {

    @Test
    void testCompateWordsAnagramsAsAnagrams() {
        assertTrue(QuestionThree.compateWordsAnagrams("voo", "ovo"));
    }

    @Test
    void testCompateWordsAnagramsAsNotAnagrams() {
        assertFalse(QuestionThree.compateWordsAnagrams("olho", "ovo"));
    }

    @Test
    void testGetNumberOfWordsAnagrams() {
        assertEquals(QuestionThree.getNumberOfWordsAnagrams("ovo"), 2);
        assertEquals(QuestionThree.getNumberOfWordsAnagrams("ifailuhkqq"), 3);
        assertEquals(QuestionThree.getNumberOfWordsAnagrams("ericson"), 0);
    }

}