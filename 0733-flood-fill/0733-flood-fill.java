class Solution {

    public void dfs(int[][] image,int i,int j,int color,int num)
    {
        int rows=image.length;
        int cols=image[0].length;

        if(i<0 || j<0 || i>=rows || j>=cols || image[i][j]!=num)
        return; 

        image[i][j]=color;

        dfs(image,i+1,j,color,num);
        dfs(image,i-1,j,color,num);
        dfs(image,i,j+1,color,num);
        dfs(image,i,j-1,color,num);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int num=image[sr][sc];

        if(num==color) return image;

        dfs(image,sr,sc,color,num);

        return image;

    }
}