package johny.crackingthecodinginterview.chapter1;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 * <p>
 * Assuming there are only ASCII characters
 */
public class Question1 {

    public boolean checkIsUnique(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] flags = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (flags[index]) {
                return false;
            }
            flags[index] = true;
        }
        return true;
    }

    // assuming there are only characters from a - z
    public boolean checkIsUnique1(String str) {
        int checker = 0;
        int offset = 'a';
        if (str.length() > 26) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            int bit = str.charAt(index) - offset;
            if (((1 << bit) & checker) == 1) {
                return false;
            }
            checker |= 1 << bit;
        }
        return true;
    }
}
