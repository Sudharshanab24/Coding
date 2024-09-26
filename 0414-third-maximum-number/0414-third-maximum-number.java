class Solution
{
    public int thirdMax(int[] nums)
    {
        // Arrays.sort(nums);
        // int n=nums.length;

        
        //     int j=1;
        //     for(int i=n-1;i>0;i--)
        //     {
        //         if(nums[i]!=nums[i-1])
        //         j++;                
                
        //         if(j==3) return nums[i-1];
        //     }

        //     return nums[n-1];

        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m1)
            {
                m3=m2;m2=m1;m1=nums[i];
            }
            
            else if(nums[i]<m1 && nums[i]>m2)
            {
                m3=m2;m2=nums[i];
            }

            else if(nums[i]<m2 && nums[i]>m3)
            {
                m3=nums[i];
            }
        }

        return (m3==Long.MIN_VALUE)?(int)m1:(int)m3;
    }
}