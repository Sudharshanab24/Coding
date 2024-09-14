class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre=1;
        int post=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        res[i]=1;
        for(int i=0;i<n;i++)
        {
            res[i]*=pre;
            pre*=nums[i];

            res[n-i-1]*=post;
            post*=nums[n-1-i];
        }
        return res;
    }
}