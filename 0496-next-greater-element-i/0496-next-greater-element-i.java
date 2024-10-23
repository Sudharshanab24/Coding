class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        // HashMap<Integer,Integer> hm=new HashMap<>();

        // for(int i=0;i<nums2.length;i++)
        //     hm.put(nums2[i],i);
        
        // for(int i=0;i<nums1.length;i++)
        // {
        //     int j=hm.get(nums1[i]);
        //     int k=0;int found=0;
            
        //     for(k=j+1;k<nums2.length;k++)
        //     {
        //         if(nums2[j]<nums2[k])
        //         {
        //         System.out.println(nums2[k]);
        //         nums1[i]=nums2[k];
        //         found=1;
        //         break;
        //         }
        //     }
        //     if(found==0) nums1[i]=-1;
        // }

    // return nums1;

    List<Integer> ans=new ArrayList<>();
    Map<Integer,Integer>hm=new HashMap<>();
    Deque<Integer> st=new ArrayDeque<>();

    for(int num:nums2)
    {
        while(!st.isEmpty() && st.peek()<num)
        hm.put(st.pop(),num);

        st.push(num);
    }

    for(int num:nums1)
    {
        if(hm.containsKey(num))
            ans.add(hm.get(num));
        
        else 
        ans.add(-1);
    }

    return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}