class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); // Initialize the result array with -1
        Stack<Integer> st = new Stack<>(); // Stack to store indices

        // Traverse the array twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int currentIndex = i % n;

            // Check if the current element is the next greater element for stack's top
            while (!st.isEmpty() && nums[currentIndex] > nums[st.peek()]) {
                int topIndex = st.pop();
                ans[topIndex] = nums[currentIndex];
            }

            // Push indices onto the stack only in the first traversal
            if (i < n) {
                st.push(currentIndex);
            }
        }

        return ans;
    }
}
