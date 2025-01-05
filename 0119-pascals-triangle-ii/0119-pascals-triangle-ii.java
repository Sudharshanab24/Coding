class Solution {
    public List<Integer> getRow(int n) {
        long res = 1; // Use long to store intermediate results
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1); // The first element is always 1

        for (int i = 0; i < n; i++) {
            res = res * (n - i) / (i + 1); // Calculate the next binomial coefficient
            arr.add((int) res); // Cast back to int for storing in the ArrayList
        }
        
        return arr;
    }
}
