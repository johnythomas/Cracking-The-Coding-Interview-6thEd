package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question3Test {

    @Test
    public void testURLify() {
        Question3 q = new Question3();
        char[] str = new char[]{'a', 'a', ' ', 'b', ' ', ' ', ' '};
        assertEquals("aa%20b", q.urlify(str, 4));

        str = new char[]{'a', 'a'};
        assertEquals("aa", q.urlify(str, 2));

        str = new char[]{'a', 'a', ' '};
        assertEquals("aa", q.urlify(str, 2));

        str = new char[]{'a', 'a', ' ', 'b', ' ', ' '};
        assertEquals("aa%20b", q.urlify(str, 4));
    }
}
