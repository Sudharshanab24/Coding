import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // Create an array to store the sum of soldiers and the corresponding row index
        int[][] soldierCount = new int[m][2];

        // Calculate the sum of soldiers for each row and store it along with the row index
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            soldierCount[i][0] = sum;  // Store the sum of soldiers
            soldierCount[i][1] = i;    // Store the row index
        }

        // Sort based on the number of soldiers, and if equal, by the row index
        Arrays.sort(soldierCount, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // Sort by row index if soldier count is the same
            } else {
                return a[0] - b[0];  // Sort by number of soldiers
            }
        });

        // Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldierCount[i][1];  // Get the row index from the sorted array
        }

        return result;
    }
}
