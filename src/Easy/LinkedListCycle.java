//https://leetcode.com/problems/linked-list-cycle/description/

package Easy;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        List<ListNode> linksList = new ArrayList<>();

        while (head.next != null) {
            ListNode node = head.next;
            if (linksList.contains(node)) {
                return true;
            }
            head = head.next;
            linksList.add(head);
        }
        return false;
    }
}


