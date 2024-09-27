class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] soldierCount = new int[m][2];

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            soldierCount[i][0] = sum;  // Store the sum of soldiers
            soldierCount[i][1] = i;    // Store the row index
        }

        // Implement Bubble Sort to sort rows by the number of soldiers, and if equal, by the row index
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                // If the number of soldiers is greater, swap
                if (soldierCount[j][0] > soldierCount[j + 1][0] )
                  {
                      // Swap the number of soldiers
                    int tempSoldier = soldierCount[j][0];
                    soldierCount[j][0] = soldierCount[j + 1][0];
                    soldierCount[j + 1][0] = tempSoldier;

                    // Swap the row indices
                    int tempIndex = soldierCount[j][1];
                    soldierCount[j][1] = soldierCount[j + 1][1];
                    soldierCount[j + 1][1] = tempIndex;
                }
            }
        }

        // Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldierCount[i][1];  // Get the row index from the sorted array
        }

        return result;
    }
}
