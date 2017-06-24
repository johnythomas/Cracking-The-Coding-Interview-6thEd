package johny.crackingthecodinginterview.chapter1;

/**
 * One Array: There are 3 types of edits that can be performed on strings:
 * insert a character,
 * remove a character,
 * or replace a character.
 * Given two strings write a method to check if they are one(or zero) edit away.
 */
public class Question5 {

    public boolean isOneEditAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isOneEditReplaceAway(s1, s2);
        } else if (s1.length() - 1 == s2.length()) {
            return isOneEditInsertAway(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return isOneEditInsertAway(s2, s1);
        }
        return false;
    }

    public boolean isOneEditAway1(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        boolean differenceFound = false;
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (differenceFound) {
                    return false;
                }
                differenceFound = true;
                if (s1.length() == s2.length()) {
                    index1++;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean isOneEditReplaceAway(String s1, String s2) {
        boolean isChangeFound = false;
        for (int index = 0; index < s1.length(); index++) {
            if (s1.charAt(index) != s2.charAt(index)) {
                if (isChangeFound) {
                    return false;
                }
                isChangeFound = true;
            }
        }
        return true;
    }

    private boolean isOneEditInsertAway(String s1, String s2) {
        for (int index1 = 0, index2 = 0; index1 < s1.length(); index1++, index2++) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index1++;
            }
        }
        return true;
    }
}
