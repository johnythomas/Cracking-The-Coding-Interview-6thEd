package johny.crackingthecodinginterview.chapter2;

import johny.crackingthecodinginterview.utils.Node;

public class Palindrome {
    public boolean isPalindrome(Node head) {
        printList(head);
        Node reversed = reverseAndClone(head);
        printList(reversed);
        return isEqual(head, reversed);
    }

    private boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.getData() != two.getData()) {
                return false;
            }
            one = one.getNext();
            two = two.getNext();
        }
        return one == null && two == null;
    }

    private Node reverseAndClone(Node node) {
        Node head = null;
        while (node != null) {
            Node n = new Node(node.getData());
            n.setNext(head);
            head = n;
            node = node.getNext();
        }
        return head;
    }

    private void printList(Node head) {
        Node runner = head;
        while (runner != null) {
            System.out.print(runner.getData() + " -> ");
            runner = runner.getNext();
        }
        System.out.println();
    }
}
