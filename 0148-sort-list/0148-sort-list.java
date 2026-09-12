/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int n=0,i=0;
        while (temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int [] arr= new int[n];
        temp=head;
        while (temp!=null)
        {
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        } 
        Arrays.sort(arr);
         temp = head;
        i = 0;

        while (temp != null) {
            temp.val = arr[i];
            i++;
            temp = temp.next;
        }

        return head;
    }
}