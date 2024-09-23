class Solution {

    private int[] nums;
    private Random random=new Random();

    public Solution(int[] nums)
    {
        this.nums=nums;
    }
    
    public int pick(int target)
    {
        int count=0;
        int result=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                count++;

                int randomNumber=1+random.nextInt(count);

                if(randomNumber==count) result=i;
            }

        }

        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */