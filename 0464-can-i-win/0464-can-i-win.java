import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Boolean> memo; // Memoization to store results for game states
    private boolean[] used; // Track which numbers are used
    private int maxChoosableInteger;
    private int desiredTotal;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true; // First player wins if total is <= 0
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false; // No one can win

        this.memo = new HashMap<>();
        this.used = new boolean[maxChoosableInteger + 1]; // Keep track of used numbers
        this.maxChoosableInteger = maxChoosableInteger;
        this.desiredTotal = desiredTotal;

        return canPlayerWin(0);
    }

    private boolean canPlayerWin(int currentTotal) {
        if (currentTotal >= desiredTotal) return false; // If current total >= desiredTotal, current player loses

        int state = formatState(used); // Encode the state of the game
        if (memo.containsKey(state)) return memo.get(state); // Return cached result if state is already computed

        // Try each number from 1 to maxChoosableInteger
        for (int i = 1; i <= maxChoosableInteger; i++) {
            if (!used[i]) { // If the number is not used yet
                used[i] = true; // Mark the number as used
                // If the opponent loses after this move, the current player wins
                if (!canPlayerWin(currentTotal + i)) {
                    memo.put(state, true);
                    used[i] = false; // Backtrack
                    return true;
                }
                used[i] = false; // Backtrack
            }
        }

        // If no number leads to a win, the current player loses
        memo.put(state, false);
        return false;
    }

    // Convert the used array to a unique integer to represent the game state
    private int formatState(boolean[] used) {
        int state = 0;
        for (boolean b : used) {
            state <<= 1;
            if (b) state |= 1;
        }
        return state;
    }
}
