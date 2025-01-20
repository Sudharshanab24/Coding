class Solution {
    public int maxProfit(int[] p) 
    {
        int min=p[0];

        int pro=0;

        for(int i=1;i<p.length;i++)
        {
            if(min>p[i])
            min=p[i];

            pro=Math.max(pro,p[i]-min);
        }

        return pro;
    }
}