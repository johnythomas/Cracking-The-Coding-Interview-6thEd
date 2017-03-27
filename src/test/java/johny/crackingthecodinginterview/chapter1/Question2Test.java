package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Question2Test {

    @Test
    public void testIsPermutation() {
        Question2 q = new Question2();
        assertTrue(q.isPermutation("dog", "god"));
        assertTrue(q.isPermutation("abc", "cba"));
        assertTrue(q.isPermutation("a b", " ba"));
        assertTrue(q.isPermutation("good", "oogd"));
        assertTrue(q.isPermutation("f12da", "adf21"));
        assertTrue(q.isPermutation("abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()", ")(*&^%$#@!0987654321zyxwvutsrqponmlkjihgfedcba"));
    }
}
