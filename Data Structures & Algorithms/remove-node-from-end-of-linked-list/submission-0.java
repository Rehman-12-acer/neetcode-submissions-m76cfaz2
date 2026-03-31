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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        ListNode dummy=new ListNode(-1);
        int len=0;
        while(cur!=null)
        {
            cur=cur.next;
            len++;
        }
        int N=len-n;
        dummy.next=head;
        cur=dummy;
        while(N>0)
        {
            cur=cur.next;
            N--;
        }
        cur.next=cur.next.next;
        return dummy.next;
    }
}
