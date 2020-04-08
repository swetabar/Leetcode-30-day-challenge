package dayEight;

public class MidOfLinkedList {

    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode start = head;
        ListNode end = head;
        while(end != null && start != null && end.next != null) {
            end = end.next.next;
            start = start.next;
        }
        return start;
    }


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

}
