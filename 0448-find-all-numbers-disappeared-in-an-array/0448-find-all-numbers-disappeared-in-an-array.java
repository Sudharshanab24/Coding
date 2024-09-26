class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        // List<Integer> li=new ArrayList<>();

        // Set<Integer> set=new HashSet<>();

        // for(int i=0;i<nums.length;i++)
        // set.add(nums[i]);

        // for(int i=1;i<=nums.length;i++)
        // {
        //     if(!set.contains(i))
        //     li.add(i);
        // }

        // return li;

        boolean[] isAvailable=new boolean[nums.length];

        for(int i=0;i<nums.length;i++)
            isAvailable[nums[i]-1]=true;

        List<Integer> li=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
            if(!isAvailable[i])
               li.add(i+1);

        return li;
    }
}