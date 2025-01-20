class Solution {
    public int maxProfit(int[] p) 
    {
        int max=p[0];

        int m=0;

        for(int i=1;i<p.length;i++)
        {
            if(max>p[i])
            max=p[i];

            m=Math.max(m,p[i]-max);
        }

        return m;
    }
}