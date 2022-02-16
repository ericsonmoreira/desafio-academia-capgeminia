package tests;

import org.junit.jupiter.api.*;
import questions.QuestionOne;

import static org.junit.Assert.assertEquals;

class QuestionOneTest {

    @Test
    void testGenerateLadderNegative() {
        assertEquals(QuestionOne.generateLadder(-1), "");
    }

    @Test
    void testGenerateLadderZero() {
        assertEquals(QuestionOne.generateLadder(0), "");
    }

    @Test
    void testGenerateLadderOne() {
        assertEquals(QuestionOne.generateLadder(1), "*\n");
    }

    @Test
    void testGenerateLadderFive() {
        assertEquals(QuestionOne.generateLadder(5),
                "    *\n" +
                "   **\n" +
                "  ***\n" +
                " ****\n" +
                "*****\n");
    }
}