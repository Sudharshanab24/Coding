class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums2.length;i++)
            hm.put(nums2[i],i);
        
        for(int i=0;i<nums1.length;i++)
        {
            int j=hm.get(nums1[i]);
            int k=0;int found=0;
            
            for(k=j+1;k<nums2.length;k++)
            {
                if(nums2[j]<nums2[k])
                {
                System.out.println(nums2[k]);
                nums1[i]=nums2[k];
                found=1;
                break;
                }
            }
            if(found==0) nums1[i]=-1;
        }

        return nums1;
    }
}