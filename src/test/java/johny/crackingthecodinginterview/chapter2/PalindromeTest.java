package johny.crackingthecodinginterview.chapter2;

import johny.crackingthecodinginterview.utils.Node;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setup() {
        this.palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindromeForEmptyLists() {
        assertThat(this.palindrome.isPalindrome(null)).isTrue();
    }

    @Test
    public void testIsPalindromeTrueForEvenLengthList() {
        assertThat(this.palindrome
                .isPalindrome(new Node(1, new Node(2, new Node(2, new Node(1))))))
                .isTrue();
    }

    @Test
    public void testIsPalindromeFalseForEvenLengthList() {
        assertThat(this.palindrome.
                isPalindrome(new Node(1, new Node(2, new Node(1, new Node(1))))))
                .isFalse();
    }

    @Test
    public void testIsPalindromeTrueForOddLengthList() {
        assertThat(this.palindrome
                .isPalindrome(new Node(1, new Node(2, new Node(1)))))
                .isTrue();
    }

    @Test
    public void testIsPalindromeFalseForOddLengthList() {
        assertThat(this.palindrome
                .isPalindrome(
                        new Node(3, new Node(2, new Node(1, new Node(1, new Node(3)))))))
                .isFalse();
    }
}
