package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUniqueTest {

    @Test
    public void testIsUnique() {
        IsUnique isUnique = new IsUnique();
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
}
