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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode t1=l1;
        ListNode t2=l2;

        ListNode head=null;
        ListNode tail=null;

        int rem=0;

        while(t1!=null || t2!=null)
        {
            int num=rem;

            if(t1!=null)
            {
            num=num+t1.val;
            t1=t1.next;
            }

            if(t2!=null)
            {
            num=num+t2.val;
            t2=t2.next;
            }

            rem=num/10;
            
            ListNode nn=new ListNode(num%10);
            nn.next=null;

            if(head==null)
            {
              head=nn;
              tail=nn;
            }

            else
            {
              tail.next=nn;
              tail=nn;
            }
        }
        
        if(rem!=0)
        {
             ListNode nn=new ListNode(rem);
             tail.next=nn;
              tail=nn;
        }
        return head;
    }
}