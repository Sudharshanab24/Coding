import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        // Map to store row index and the corresponding number of soldiers (sum of 1s)
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Calculate the sum of soldiers for each row and store it in the map
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            hm.put(i, sum);  // Row index as key, sum of soldiers as value
        }

        // Create a list of map entries and sort by value (number of soldiers)
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(hm.entrySet());

        // Sort the entries first by the number of soldiers (value), then by row index (key)
        Collections.sort(sortedEntries, (entry1, entry2) -> {
            if (entry1.getValue().equals(entry2.getValue())) {
                return entry1.getKey() - entry2.getKey();  // Sort by row index if values are the same
            } else {
                return entry1.getValue() - entry2.getValue();  // Sort by number of soldiers
            }
        });

        // Result array to store the indexes of the k weakest rows
        int[] arr = new int[k];
        
        // Add the first k weakest rows to the result array
        for (int i = 0; i < k; i++) {
            arr[i] = sortedEntries.get(i).getKey();
        }

        return arr;
    }
}
