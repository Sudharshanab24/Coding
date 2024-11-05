class Pair
{
    int r;int c;
    Pair(int r,int c)
    {
        this.r=r;
        this.c=c; 
    }
}
class Solution
{
    public int numEnclaves(int[][] grid)
    {
        Queue<Pair> q=new LinkedList<>();

        int m=grid.length;
        int n=grid[0].length;

        int vis[][]=new int[m][n];

        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1)
            {
                q.add(new Pair(0,i));
                vis[0][i]=1;
            }
            if(grid[m-1][i]==1)
            {
                q.add(new Pair(m-1,i));
                vis[m-1][i]=1;
            }
        }


        for(int i=0;i<m;i++)
        {
            if(grid[i][0]==1 && vis[i][0]==0)
            {
                q.add(new Pair(i,0));
                vis[i][0]=1;
            }
            if(grid[i][n-1]==1 && vis[i][n-1]==0)
            {
                q.add(new Pair(i,n-1));
                vis[i][n-1]=1;
            }
        }

        int [] drow={-1,0,1,0};
        int [] dcol={0,1,0,-1};

        while(!q.isEmpty())
        {
            int r=q.peek().r;
            int c=q.peek().c;

            q.poll();

            for(int i=0;i<4;i++)
            {
                int nr=r+drow[i];
                int nc=c+dcol[i];

                if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && vis[nr][nc]==0)
                {
                    q.add(new Pair(nr,nc));
                    vis[nr][nc]=1;
                }
            }
        }

        int ans=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0) ans++;
            }
        }

        return ans;
    }
}