class Solution {
    public int nextGreaterElement(int n) {

        // Convert number to a char array for easier manipulation
        char[] num = Integer.toString(n).toCharArray();
        int no = num.length;
        int index = -1;

        // Step 1: Find the first decreasing digit from the right
        for (int i = no - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such index is found, return -1 (number is in descending order)
        if (index == -1) {
            return -1;
        }

        // Step 2: Find the smallest digit larger than num[index] to the right of it
        int swapIndex = -1;
        for (int j = no - 1; j > index; j--) {
            if (num[j] > num[index]) {
                swapIndex = j;
                break;
            }
        }

        // Step 3: Swap the two digits
        char temp = num[index];
        num[index] = num[swapIndex];
        num[swapIndex] = temp;

        // Step 4: Reverse the digits to the right of index to get the smallest permutation
        reverse(num, index + 1, no - 1);

        // Convert the result back to an integer
        try {
            return Integer.parseInt(new String(num));
        } catch (NumberFormatException e) {
            return -1; // Handle overflow
        }
    }

    // Helper method to reverse a portion of the array
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
