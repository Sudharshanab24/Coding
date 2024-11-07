class Solution {
    public int networkDelayTime(int[][] times, int n, int k)
    {
        int e=times.length;

        int dist[]=new int[n+1];

        for(int i=0;i<=n;i++)
        dist[i]=Integer.MAX_VALUE;

        dist[k]=0;

        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<e;i++)
            {
                int u=times[i][0];
                int v=times[i][1];
                int w=times[i][2];

                if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+w)
                dist[v]=dist[u]+w;
            }
        }
        
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
            return -1;
            if(sum<dist[i])
            sum=dist[i];
        }
        return sum;
    }
}