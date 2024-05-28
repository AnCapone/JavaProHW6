import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversed = reverseList(head);
        System.out.print("[");
        while (reversed != null) {
            System.out.print(reversed.val);
            reversed = reversed.next;
            if (reversed != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static ListNode reverseList(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode reversedHead = new ListNode();
        head = reversedHead;
        while (!stack.isEmpty()) {
            head.next = new ListNode(stack.pop());
            head = head.next;
        }

        return reversedHead.next;
    }


}

