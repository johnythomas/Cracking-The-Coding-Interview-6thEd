package johny.crackingthecodinginterview.chapter1;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the
 * additional characters, and that you are given the 'true' length of the string.
 * (Note: if implementing in java, please use a character array so that you
 * can perform the operation in place.)
 */
public class Question3 {

    public String urlify(char[] str, int trueLength) {
        int spaceCount = getSpaceCount(str, trueLength);
        int stringLength = trueLength + 2 * spaceCount;
        if (str.length > stringLength) {
            str[stringLength] = '\0';
        }
        for (int i = trueLength - 1, index = stringLength - 1; i > 0; i--) {
            if (str[i] == ' ') {
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';
            } else {
                str[index--] = str[i];
            }
        }
        return String.valueOf(str).trim();
    }

    private int getSpaceCount(char[] str, int trueLengh) {
        int spaceCount = 0;
        for (int index = 0; index < trueLengh; index++) {
            if (str[index] == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
