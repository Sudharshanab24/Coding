class Solution {
  public void moveZeroes(int[] nums) {

    // int pos=0;
    
    // for(int i=0;i<nums.length;i++)
    // {
    //      if(nums[i]!=0)
    //      {
    //         int temp=nums[pos];
    //         nums[pos]=nums[i];
    //         nums[i]=temp;

    //         pos++;
            
    //      }
    // }

    int l=0,r=0;
    int n=nums.length;

    if(n==1) return ;

     while(r!=n)
     {
         if(nums[r]!=0)
         {
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
         }
         r++;
     }

  }

}