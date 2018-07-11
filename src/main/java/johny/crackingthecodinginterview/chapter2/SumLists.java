package johny.crackingthecodinginterview.chapter2;

import johny.crackingthecodinginterview.utils.Node;

public class SumLists {

    public Node addReverseList(Node l1, Node l2, int carry) {
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
            Node more = addReverseList(
                    l1 == null ? null : l1.getNext(),
                    l2 == null ? null : l2.getNext(),
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }

        return result;
    }

    public Node addList(Node l1, Node l2) {
        int len1 = length(l1);
        int len2 = length(l2);

        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        } else {
            l2 = padList(l2, len1 - len2);
        }

        PartialSum sum = addListHelper(l1, l2);

        if (sum.carry == 0) {
            return sum.sum;
        } else {
            Node result = insertBefore(sum.sum, sum.carry);
            return result;
        }
    }

    private PartialSum addListHelper(Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }

        PartialSum sum = addListHelper(l1.getNext(), l2.getNext());

        int val = sum.carry + l1.getData() + l2.getData();

        Node fullResult = insertBefore(sum.sum, val % 10);

        sum.sum = fullResult;
        sum.carry = val / 10;
        return sum;
    }

    private int length(Node list) {
        Node runner = list;
        int len = 0;
        while (runner != null) {
            runner = runner.getNext();
            len++;
        }
        return len;
    }

    private Node padList(Node l, int padding) {
        Node head = l;
        for (int i = 0; i < padding; i++) {
            head = insertBefore(head, 0);
        }
        return head;
    }

    private Node insertBefore(Node list, int data) {
        Node node = new Node();
        node.setData(data);
        if (list != null) {
            node.setNext(list);
        }
        return node;
    }

}

class PartialSum {
    public Node sum = null;
    public int carry = 0;
}


