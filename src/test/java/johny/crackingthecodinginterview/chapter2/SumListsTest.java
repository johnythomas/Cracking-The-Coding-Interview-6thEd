package johny.crackingthecodinginterview.chapter2;

import johny.crackingthecodinginterview.utils.Node;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumListsTest {

    SumLists sumLists;

    @Before
    public void setup() {
        this.sumLists = new SumLists();
    }

    @Test
    public void testAddListsForEmptyLists() {
        assertThat(this.sumLists.addList(null, null, 0)).isNull();
    }

    @Test
    public void testAddListsForSameSizeList() {
        Node l1 = new Node(1, new Node(2, new Node(3, null)));
        Node l2 = new Node(1, new Node(2, new Node(5, null)));

        Node resultNode = this.sumLists.addList(l1, l2, 0);
        assertNode(resultNode, new int[]{2, 4, 8});
    }

    @Test
    public void testAddListsForSumWithCarry() {
        Node l1 = new Node(9, new Node(5, new Node(4, null)));
        Node l2 = new Node(8, new Node(7, new Node(6, null)));

        Node resultNode = this.sumLists.addList(l1, l2, 0);
        assertNode(resultNode, new int[]{7, 3, 1, 1});
    }

    public void assertNode(Node node, int[] expectedValue) {
        int index = 0;
        while (node != null) {
            assertThat(node.getData()).isEqualTo(expectedValue[index++]);
            node = node.getNext();
        }
        assertThat(index)
                .as("checking result length")
                .withFailMessage("incorrect result length")
                .isEqualTo(expectedValue.length);
    }
}
