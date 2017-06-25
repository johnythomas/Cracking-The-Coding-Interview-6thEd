package johny.crackingthecodinginterview.chapter1;

/**
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the compressed string would not become smalled than the original string your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class Question6 {

    public String compress(String str) {
        int countConsecutive = 0;
        StringBuilder compressedString = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            countConsecutive++;
            if (index + 1 >= str.length() || str.charAt(index + 1) != str.charAt(index)) {
                compressedString.append(str.charAt(index)).append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return str.length() <= compressedString.length() ? str : compressedString.toString();
    }

    public String compress1(String str) {
        int compressedStringLength = getCompressedStringLength(str);
        if (str.length() <= compressedStringLength) {
            return str;
        }
        int countConsecutive = 0;
        StringBuilder compressedString = new StringBuilder(compressedStringLength);
        for (int index = 0; index < str.length(); index++) {
            countConsecutive++;
            if (index + 1 >= str.length() || str.charAt(index + 1) != str.charAt(index)) {
                compressedString.append(str.charAt(index)).append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.toString();
    }

    private int getCompressedStringLength(String str) {
        int compressedStringLength = 0;
        int countConsecutive = 0;
        for (int index = 0; index < str.length(); index++) {
            countConsecutive++;
            if (index + 1 >= str.length() || str.charAt(index + 1) != str.charAt(index)) {
                compressedStringLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedStringLength;
    }
}
