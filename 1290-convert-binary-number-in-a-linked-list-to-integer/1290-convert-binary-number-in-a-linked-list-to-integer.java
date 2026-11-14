class Solution {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        int ans = 0;

        ListNode temp = head;
        ListNode temp2 = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int power = count - 1;

        while (temp2 != null) {
            if (temp2.val == 1) {
                ans += (int) Math.pow(2, power);
            }

            power--;
            temp2 = temp2.next;
        }

        return ans;
    }
}