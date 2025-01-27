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
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)
        return true;

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;

        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode rev=reverse(slow);

        ListNode temp1=head;
        ListNode temp2=rev;

        while(temp2!=null)
        {
           
            if(temp1.val!=temp2.val)
            return false;

            temp1=temp1.next;
            temp2=temp2.next;
        }

        return true;


    }
}