import java.util.HashSet;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        
        // Initialize first and last occurrence arrays
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }
        
        // Record first and last occurrences of each character
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (first[index] == -1) {
                first[index] = i;
            }
            last[index] = i;
        }
        
        int count = 0;
        
        // Check for palindromic subsequences
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] != -1 && last[i] > first[i] + 1) {
                HashSet<Character> innerChars = new HashSet<>();
                // Collect unique characters between the first and last occurrence
                for (int j = first[i] + 1; j < last[i]; j++) {
                    innerChars.add(s.charAt(j));
                }
                count += innerChars.size(); // Add the number of unique inner characters
            }
        }
        
        return count;
    }
}
