package johny.crackingthecodinginterview.chapter1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question6Test {

    private Question6 q = new Question6();

    @Test
    public void compress() {
        assertThat(q.compress("a")).isEqualTo("a");
        assertThat(q.compress("aaaa")).isEqualTo("a4");
        assertThat(q.compress("aaabbb")).isEqualTo("a3b3");
        assertThat(q.compress("abaabbccc")).isEqualTo("abaabbccc");
        assertThat(q.compress("aaaabbbbaaaacccda")).isEqualTo("a4b4a4c3d1a1");
    }

    @Test
    public void compress1() {
        assertThat(q.compress1("a")).isEqualTo("a");
        assertThat(q.compress1("aaaa")).isEqualTo("a4");
        assertThat(q.compress1("aaabbb")).isEqualTo("a3b3");
        assertThat(q.compress1("abaabbccc")).isEqualTo("abaabbccc");
        assertThat(q.compress1("aaaabbbbaaaacccda")).isEqualTo("a4b4a4c3d1a1");
    }
}