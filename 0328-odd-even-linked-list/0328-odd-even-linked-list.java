class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        if (curr == null || curr.next == null) return curr;

        ListNode slow = curr;
        ListNode fast = curr.next;
        ListNode fastHead = fast;

        while (fast != null && fast.next != null) {
            slow.next = fast.next;
            slow = slow.next;

            fast.next = slow.next;
            fast = fast.next;
        }

        slow.next = fastHead;
        return curr;
    }
}