package johny.crackingthecodinginterview.chapter1;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class IsUnique {

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
}
