class Solution {
    // Node class for the linked list
    class Node {
        int val;
        int frequency;
        Node next;
        
        Node(int val, int frequency) {
            this.val = val;
            this.frequency = frequency;
            this.next = null;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a HashMap to count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Initialize the linked list with dummy head
        Node dummyHead = new Node(-1, -1);
        
        // Step 3: Insert nodes into the linked list in sorted order
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            Node newNode = new Node(entry.getKey(), entry.getValue());
            Node prev = dummyHead;
            Node curr = dummyHead.next;
            
            while (curr != null && curr.frequency > newNode.frequency) {
                prev = curr;
                curr = curr.next;
            }
            newNode.next = curr;
            prev.next = newNode;
        }
        
        // Step 4: Traverse the linked list and add first k elements to the result
        int[] result = new int[k];
        Node current = dummyHead.next;
        for (int i = 0; i < k; i++) {
            result[i] = current.val;
            current = current.next;
        }
        
        return result;
    }
}