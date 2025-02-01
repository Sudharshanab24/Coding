class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;          // Points to odd indexed nodes
        ListNode even = head.next;    // Points to even indexed nodes
        ListNode evenHead = even;     // Store head of even list

        while (even != null && even.next != null) {
            odd.next = even.next;     // Link odd node to next odd node
            odd = odd.next;           // Move odd pointer
            even.next = odd.next;     // Link even node to next even node
            even = even.next;         // Move even pointer
        }

        odd.next = evenHead;  // Connect the end of the odd list to the even list
        return head;
    }
}
