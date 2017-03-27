package johny.crackingthecodinginterview.chapter1;

/**
 * Given a string write a method to decide if one is a permutation of the other
 */
public class Question2 {

    public boolean isPermutation(String str1, String str2) {
        int[] charCount = new int[128];
        for (int index = 0; index < str1.length(); index++) {
            int charIndex = str1.charAt(index);
            charCount[charIndex]++;
        }
        for (int index = 0; index < str2.length(); index++) {
            int charIndex = str2.charAt(index);
            if (--charCount[charIndex] < 0) {
                return false;
            }
        }
        return true;
    }
}
