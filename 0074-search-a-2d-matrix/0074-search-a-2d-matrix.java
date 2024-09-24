class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]<=target)
            {
                for(int j=0;j<n;j++)
                {
                    if(matrix[i][j]==target) return true;
                }
            }
        }

        return false;

        // int l=0;
        // int r=m*n;

        // while(l<r)
        // {
        //     final int mid=(l+r)/2;
        //     final int i=mid/n;
        //     final int j=mid%n;

        //     if(matrix[i][j]==target) return true;
        //     if(matrix[i][j]<target) l=mid+1;
        //     else r=mid;
        // }

        // return false;
    }
}