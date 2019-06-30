package topInterviewQuestions.easy.linkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println(LinkedListCycle.hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {
        if (head==null ||head.next == null) {
            return false;
        }
        ListNode slow = head;
        System.out.println(slow.hashCode());
        ListNode fast = head.next;
        System.out.println(fast.hashCode());
        while (slow.next != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            if(fast.next.next == null){
                return false;
            }
            fast = fast.next.next;
        }
        return false;
    }
}
