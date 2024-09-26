class Solution {
    public int[] intersect(int[] nums1, int[] nums2)
    {
        int n1=nums1.length;
        int n2=nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;

        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            i++;

            else if(nums2[j]<nums1[i])
            j++;

            else
            {
                nums1[k]=nums1[i];
                i++;
                j++;
                k++;
            }
            
        }
      return Arrays.copyOfRange(nums1,0,k);
        
    }
}