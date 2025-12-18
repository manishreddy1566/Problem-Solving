class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumbers {

    static ListNode addTwoNumbers(ListNode first, ListNode second) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;

        while (first != null || second != null || carry != 0) {
            int value1 = getValue(first);
            int value2 = getValue(second);

            int sum = value1 + value2 + carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            first = moveNext(first);
            second = moveNext(second);
        }

        return head;
    }

    static int getValue(ListNode node) {
        return node == null ? 0 : node.val;
    }

    static ListNode moveNext(ListNode node) {
        return node == null ? null : node.next;
    }

    static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode result = addTwoNumbers(l1, l2);
        print(result);
    }
}
