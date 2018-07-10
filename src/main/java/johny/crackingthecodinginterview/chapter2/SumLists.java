package johny.crackingthecodinginterview.chapter2;

import johny.crackingthecodinginterview.utils.Node;

public class SumLists {

    public Node addList(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int value = carry;
        if (l1 != null) {
            value += l1.getData();
        }
        if (l2 != null) {
            value += l2.getData();
        }

        Node result = new Node();
        result.setData(value % 10);

        if (l1 != null || l2 != null) {
            Node more = addList(
                    l1 == null ? null : l1.getNext(),
                    l2 == null ? null : l2.getNext(),
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }

        return result;
    }
}
