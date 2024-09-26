class Solution {
    public int thirdMax(int[] nums)
    {
        Arrays.sort(nums);
        int n=nums.length;

        
            int j=1;
            for(int i=n-1;i>0;i--)
            {
                if(nums[i]!=nums[i-1])
                j++;
                
                if(j==3) return nums[i-1];
            }

            return nums[n-1];
        

    }
}