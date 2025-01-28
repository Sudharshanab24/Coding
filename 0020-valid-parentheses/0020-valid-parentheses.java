import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        // Iterate through the string characters
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (c == '[' || c == '(' || c == '{') {
                st.push(c);
            } 
            // If it's a closing bracket, check if it matches the stack's top
            else {
                if (st.isEmpty() || !isValidPair(st.pop(), c)) {
                    return false;  // Early exit if invalid
                }
            }
        }

        // If the stack is empty, all brackets matched correctly
        return st.isEmpty();
    }

    // Helper function to check if a pair of brackets is valid
    private boolean isValidPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '[' && close == ']') || 
               (open == '{' && close == '}');
    }
}
