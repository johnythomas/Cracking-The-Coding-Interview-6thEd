package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question4Test {

    @Test
    public void testIsPermutationOfPalindrome() {
        Question4 q = new Question4();
        assertTrue(q.isPermutationOfPalindrome("a"));
        assertTrue(q.isPermutationOfPalindrome("A"));
        assertTrue(q.isPermutationOfPalindrome("aab"));
        assertTrue(q.isPermutationOfPalindrome("aAb"));
        assertTrue(q.isPermutationOfPalindrome("a ab bc"));
        assertTrue(q.isPermutationOfPalindrome("aba"));
        assertTrue(q.isPermutationOfPalindrome("a abbc"));
        assertTrue(q.isPermutationOfPalindrome("1 21"));
        assertFalse(q.isPermutationOfPalindrome("abca b cabcabcabc"));
        assertTrue(q.isPermutationOfPalindrome("x yx"));
        assertFalse(q.isPermutationOfPalindrome("xyz"));
        assertFalse(q.isPermutationOfPalindrome("x y"));
        assertFalse(q.isPermutationOfPalindrome("x y ya"));
    }

    @Test
    public void testIsPermutationOfPalindrome1() {
        Question4 q = new Question4();
        assertTrue(q.isPermutationOfPalindrome1("a"));
        assertTrue(q.isPermutationOfPalindrome1("A"));
        assertTrue(q.isPermutationOfPalindrome1("aAb"));
        assertTrue(q.isPermutationOfPalindrome1("aab"));
        assertTrue(q.isPermutationOfPalindrome1("a ab bc"));
        assertTrue(q.isPermutationOfPalindrome1("aba"));
        assertTrue(q.isPermutationOfPalindrome1("a abbc"));
        assertTrue(q.isPermutationOfPalindrome1("1 21"));
        assertFalse(q.isPermutationOfPalindrome1("abca b cabcabcabc"));
        assertTrue(q.isPermutationOfPalindrome1("x yx"));
        assertFalse(q.isPermutationOfPalindrome1("xyz"));
        assertFalse(q.isPermutationOfPalindrome1("x y"));
        assertFalse(q.isPermutationOfPalindrome1("x y ya"));
    }
}
