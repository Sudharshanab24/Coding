class Solution {

    public void permutation(int[] nums,List<Integer> arr,List<List<Integer>> ans,boolean flag[])
    {
        if(arr.size()==nums.length)
        {
            ans.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!flag[i])
            {
                arr.add(nums[i]);
                flag[i]=true;
                permutation(nums,arr,ans,flag);

                arr.remove(arr.size()-1);
                flag[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean flag[]=new boolean[nums.length]; 

        permutation(nums,arr,ans,flag);

        return ans;

    }
}