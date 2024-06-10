package Easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode newHead = null;
        ListNode currentNewNode = null;
        while (list1 != null && list2 != null) {

            ListNode newItem;
            if (list1.val >= list2.val) {
                newItem = new ListNode(list2.val);
                if (newHead == null) {
                    newHead = newItem;
                    list2 = list2.next;
                    currentNewNode = newHead;
                    continue;
                }
                currentNewNode.next = newItem;
                list2 = list2.next;
            }

            else  {
                newItem = new ListNode(list1.val);
                if (newHead == null) {
                    newHead = newItem;
                    list1 = list1.next;
                    currentNewNode = newHead;
                    continue;
                }
                currentNewNode.next = newItem;
                list1 = list1.next;
            }
            currentNewNode = currentNewNode.next;
        }
        if (list1 != null) {
            currentNewNode.next = list1;
        } else {
            currentNewNode.next = list2;
        }
        return newHead;
    }
}
