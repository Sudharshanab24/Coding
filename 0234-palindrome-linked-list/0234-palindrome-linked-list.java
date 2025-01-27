class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev forward
            curr = nextNode; // Move curr forward
        }

        return prev; // New head of the reversed list
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // A single-node or empty list is always a palindrome
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverse(slow);

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode temp2 = secondHalf;

        // Adjust the comparison for odd-length lists
        while (temp2 != null) {
            if (firstHalf.val != temp2.val) {
                return false; // Mismatch found, not a palindrome
            }
            firstHalf = firstHalf.next;
            temp2 = temp2.next;
        }

        // Step 4: (Optional) Restore the original list structure
        reverse(secondHalf); // Undo the reversal

        return true; // All nodes matched, it's a palindrome
    }
}
