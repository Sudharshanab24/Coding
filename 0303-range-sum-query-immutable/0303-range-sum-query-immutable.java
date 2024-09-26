class NumArray {

    private int[] pre;

    public NumArray(int[] nums)
    {
        // this.nums=nums;
        pre=new int[nums.length+1];

        for(int i=0;i<nums.length;i++)
        pre[i+1]=pre[i]+nums[i];

    }
    
    public int sumRange(int left, int right)
    {
        // int sum=0;
        // for(int i=left;i<=right;i++)
        // sum=sum+nums[i];
        // return sum;

        return pre[right+1]-pre[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */