class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if (head == null || head.next == null)
            return null;

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int n = count / 2;

        temp = head;

        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}