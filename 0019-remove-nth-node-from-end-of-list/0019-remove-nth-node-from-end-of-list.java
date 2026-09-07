class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        ListNode res = temp;
        int count = 0;
        int s = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == n) {
            return head.next;
        }

        temp = head;

        while (temp != null) {
            s++;

            if (s == count - n) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return res;
    }
}