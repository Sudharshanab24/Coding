class Solution {
    public boolean divideArray(int[] nums) {

        int m=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<m;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        for(int value:hm.values())
        {
            if(value%2!=0) return false;
        }

        return true;
        
    }
}


// class Solution {
//   public boolean divideArray(int[] nums) {
//     int[] count = new int[501];

//     for (final int num : nums)
//       ++count[num];

//     return Arrays.stream(count).allMatch(c -> c % 2 == 0);
//   }
// }