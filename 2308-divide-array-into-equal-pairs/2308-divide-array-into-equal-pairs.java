class Solution {
    public boolean divideArray(int[] nums) {

        int m=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<m;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        for(int value:hm.values())
        {
            if(value%2!=0) return false;
        }

        return true;
        
    }
}