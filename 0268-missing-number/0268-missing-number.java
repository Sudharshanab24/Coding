class Solution
{
    public int missingNumber(int[] nums)
    {
        // Arrays.sort(nums);

        // int n=nums.length;int i=0;

        // for(i=0;i<n;i++)
        // {
        // if(nums[i]!=i)
        // return i;
        // }
        // return n;

        int res=nums.length;
        for(int i=0;i<nums.length;i++)
        res=res+i-nums[i];
        return res;
    }
}