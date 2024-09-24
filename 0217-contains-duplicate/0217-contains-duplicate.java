class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        hs.add(nums[i]);

        if(hs.size()!=nums.length) return true;
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); 
//         for (int i = 0; i < nums.length - 1; i++) {
//                 if (nums[i] == nums[i+1]) {
//                     return true;
//                 }
//         }
//         return false;
//     }
// }

