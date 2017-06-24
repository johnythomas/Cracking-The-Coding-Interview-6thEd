package johny.crackingthecodinginterview.chapter1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Question5Test {

    private Question5 q = new Question5();

    @Test
    public void isOneEditAwayTestForStringWithLengthDifferenceMoreThanOne() {
        String s1 = "apple";
        String s2 = "orangesss";
        assertThat(q.isOneEditAway(s1, s2)).isFalse();
        assertThat(q.isOneEditAway1(s1, s2)).isFalse();
    }

    @Test
    public void isOneEditAwayTestForStringsThatAreSame() {
        String s1 = "apple";
        String s2 = "apple";
        assertThat(q.isOneEditAway(s1, s2)).isTrue();
        assertThat(q.isOneEditAway1(s1, s2)).isTrue();
    }

    @Test
    public void isOneEditAwayTestForReplace() {
        String s1 = "apple";
        String s2 = "apply";
        assertThat(q.isOneEditAway(s1, s2)).isTrue();
        assertThat(q.isOneEditAway1(s1, s2)).isTrue();
    }

    @Test
    public void isOneEditAwayTestForReplaceFailure() {
        String s1 = "apple";
        String s2 = "aptly";
        assertThat(q.isOneEditAway(s1, s2)).isFalse();
        assertThat(q.isOneEditAway1(s1, s2)).isFalse();
    }

    @Test
    public void isOneEditAwayForInsert() {
        String s1 = "apple";
        String s2 = "aple";
        assertThat(q.isOneEditAway(s1, s2)).isTrue();
        assertThat(q.isOneEditAway1(s1, s2)).isTrue();
    }

    @Test
    public void isOneEditAwayForInsertFailure() {
        String s1 = "apple";
        String s2 = "apla";
        assertThat(q.isOneEditAway(s1, s2)).isFalse();
        assertThat(q.isOneEditAway1(s1, s2)).isFalse();
    }

    @Test
    public void isOneEditAwayForRemove() {
        String s1 = "aple";
        String s2 = "apple";
        assertThat(q.isOneEditAway(s1, s2)).isTrue();
        assertThat(q.isOneEditAway1(s1, s2)).isTrue();
    }

    @Test
    public void isOneEditAwayForRemoveFailure() {
        String s1 = "apla";
        String s2 = "apple";
        assertThat(q.isOneEditAway(s1, s2)).isFalse();
        assertThat(q.isOneEditAway1(s1, s2)).isFalse();
    }
}