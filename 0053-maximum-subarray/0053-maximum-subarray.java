class Solution {
    
    public int maxSubArray(int[] arr) {

        int max=0,maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           max=max+arr[i];

           if(max>maxSoFar) maxSoFar=max;

           if(max<0) max=0;
        }
        return maxSoFar;
    
    }
}