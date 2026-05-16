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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode total=new ListNode(-1);
        ListNode cur=total;
        int val=0;
        while(l1!=null&&l2!=null)
        {
            val+=l1.val+l2.val;
            if(val>9)
            {
                int Nval=val-10;
                ListNode added = new ListNode(Nval);
                cur.next=added;
                cur=cur.next;
                l1=l1.next;
                l2=l2.next;
                val=1;
            }
            else
            {
                ListNode added= new ListNode(val);
                cur.next=added;
                cur=cur.next;
                l1=l1.next;
                l2=l2.next;
                val=0;
            }
            
        }
        int Nvl1=0;
        while(l1!=null)
        {
            Nvl1=val+l1.val;
            if(Nvl1>9)
            {
                int nvl1=Nvl1-10;
                ListNode added=new ListNode(nvl1);
                cur.next=added;
                cur=cur.next;
                l1=l1.next;
                val=1;

            }
            else
            {
                ListNode added= new ListNode(Nvl1);
                cur.next=added;
                cur=cur.next;
                l1=l1.next;
                val=0;
            }
        }
        int Nvl2=0;
        while(l2!=null)
        {
            Nvl2=val+l2.val;
            if(Nvl2>9)
            {
                int nvl2=Nvl2-10;
                ListNode added= new ListNode(nvl2);
                cur.next=added;
                cur=cur.next;
                l2=l2.next;
                val=1;
            }
            else
            {
                ListNode added=new ListNode(Nvl2);
                cur.next=added;
                cur=cur.next;
                l2=l2.next;
                val=0;
            }
        }

        if(val==1)
        {
            cur.next=new ListNode(1);
        }
        return total.next;

    }
}
