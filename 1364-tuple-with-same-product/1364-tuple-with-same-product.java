import java.util.Collection;
class Solution {
    public int tupleSameProduct(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int pro=nums[i]*nums[j];
                hm.put(pro,hm.getOrDefault(pro,0)+1);
            }
        }

        int count=0;

        Collection<Integer> values = hm.values();

        for(int val :values)
        {
            if(val>1)
            {
                count+=8*(val*(val-1)/2);
            }
        }

        return count;
        
    }
}