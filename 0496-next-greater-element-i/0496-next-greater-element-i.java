class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums2.length;i++)
        {
            while(!st.isEmpty() && st.peek()<nums2[i])
            hm.put(st.pop(),nums2[i]);

            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            nums1[i]=hm.get(nums1[i]);

            else
            nums1[i]=-1;
        }

        return nums1;
    }
}