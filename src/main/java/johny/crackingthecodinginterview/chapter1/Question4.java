package johny.crackingthecodinginterview.chapter1;

/**
 * Question: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of words.
 * The palindrome words does not need to be limited to dictionary words.
 */
public class Question4 {

    public boolean isPermutationOfPalindrome(String s) {
        int[] alphabetCount = new int[26];
        int oddCount = 0;
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            int charValue = getCharValue(c);
            if (charValue != -1) {
                alphabetCount[charValue]++;
                if (alphabetCount[charValue] % 2 == 0) {
                    oddCount--;
                } else {
                    oddCount++;
                }
            }
        }
        return oddCount <= 1;
    }

    public boolean isPermutationOfPalindrome1(String s) {
        int bitVector = createBitVechtor(s);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    private int getCharValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int charValue = Character.getNumericValue(c);
        if (charValue >= a && charValue <= z) {
            return Character.getNumericValue(c) - a;
        }
        return -1;
    }

    private int createBitVechtor(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int charIntValue = getCharValue(c);
            bitVector = toggle(bitVector, charIntValue);
        }
        return bitVector;
    }

    private int toggle(int bitVector, int index) {
        if (index < 0) {
            return bitVector;
        }
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    private boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }
}