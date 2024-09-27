class Solution {
    public int countPairs(List<Integer> nums, int target)
    {
        // int c=0;
        // for(int i=0;i<nums.size();i++)
        // {
        //     for(int j=i+1;j<nums.size();j++)
        //     {
        //         if(nums.get(i)+nums.get(j)<target)
        //         c++;
        //     }
        // }
        // return c;

        Collections.sort(nums);

        int l=0;
        int r=nums.size()-1;
        int count=0;

        while(l<r)
        {
            if(nums.get(l)+nums.get(r)<target)
            {
            count=count+r-l;
            l++;
            }
            else
            {
            r--;
            }

        }

        return count;
    }
}