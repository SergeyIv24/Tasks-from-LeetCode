//https://leetcode.com/problems/remove-linked-list-elements/description/
//todo in progress

package Easy;

public class RemoveLinkedListElements {

    public ListNode remove(ListNode head, int val) {
        ListNode prev = head;
        ListNode current = head;

        while (current != null) {

            if (current.val == val) {
                prev.next = current.next;
                current.next = null;
                current = prev.next;
                continue;
            }
            prev = current;
            current = current.next;
        }
        return head;


    }



    public ListNode removeElements(ListNode head, int val) {

        ListNode current = head;
        while (current != null) {

            if (current.val == val) {
                ListNode node = current.next;
                current.next = null;
                current = node;
                head = current;
                continue;
            }


            if ((current.next != null) && (current.next.val == val)) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}
