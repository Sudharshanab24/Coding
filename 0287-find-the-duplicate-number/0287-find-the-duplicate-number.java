class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        for(Map.Entry<Integer,Integer> ent:hm.entrySet())
        {
            if(ent.getValue()>1)
            {
            return ent.getKey();
            }

        }
        return 0;
    }
}