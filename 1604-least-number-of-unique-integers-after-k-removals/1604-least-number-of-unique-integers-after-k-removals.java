class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

        PriorityQueue<Integer> mh=new PriorityQueue<>(hm.values());

        while(k>0)
            k=k-mh.poll();
        
        return mh.size()+(k<0 ? 1:0);
        
    }
}