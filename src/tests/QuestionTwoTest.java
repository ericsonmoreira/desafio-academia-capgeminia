package tests;

import org.junit.jupiter.api.Test;
import questions.QuestionTwo;

import static org.junit.Assert.assertEquals;

class QuestionTwoTest {

    @Test
    void testGetNumberOfCharsTalkingNotSecure() {
        assertEquals(QuestionTwo.getNumberOfCharsTalking("das"), 3);
    }

    @Test
    void testGetNumberOfCharsTalkingSecure() {
        assertEquals(QuestionTwo.getNumberOfCharsTalking("dadasdasds"), 0);
    }

}