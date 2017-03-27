package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question1Test {

    @Test
    public void testIsUnique() {
        Question1 isUnique = new Question1();
        assertTrue(isUnique.checkIsUnique("a"));
        assertTrue(isUnique.checkIsUnique("abc"));
        assertTrue(isUnique.checkIsUnique("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(isUnique.checkIsUnique("1234567890"));
        assertTrue(isUnique.checkIsUnique("xyz"));
        assertTrue(isUnique.checkIsUnique("xyz123"));
        assertFalse(isUnique.checkIsUnique("aa"));
        assertFalse(isUnique.checkIsUnique("aba"));
        assertFalse(isUnique.checkIsUnique("aabbbbbbbbbbbbbbbbbbbbbbb"));
        assertFalse(isUnique.checkIsUnique("12345678901"));
        assertFalse(isUnique.checkIsUnique("abcdefgh11"));
    }

    @Test
    public void testIsUnique1() {
        Question1 isUnique = new Question1();
        assertTrue(isUnique.checkIsUnique1("a"));
        assertTrue(isUnique.checkIsUnique1("abc"));
        assertTrue(isUnique.checkIsUnique1("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(isUnique.checkIsUnique1("xyz"));
        assertFalse(isUnique.checkIsUnique1("aa"));
        assertFalse(isUnique.checkIsUnique1("aba"));
        assertFalse(isUnique.checkIsUnique1("aabbbbbbbbbbbbbbbbbbbbbbb"));
    }
}
