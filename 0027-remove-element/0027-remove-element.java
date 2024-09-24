// class Solution
// {
//   public int removeElement(int[] nums, int val)
//   {
//       int n=nums.length;
//       for(int i=0;i<n;i++)
//       {
//         if(nums[i]==val)
//         {
//             int j=i;
//             while(j<nums.length-1)
//             {
//                 nums[j]=nums[j+1];
//                 j++;
//             }
//             n--;
//             i--;
//         }
//       }
    
//     return n;
//   }
// }

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
