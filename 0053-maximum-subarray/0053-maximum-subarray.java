class Solution
{
    public int maxSubArray(int[] arr)
    {
        int max=0,maxSoFar=Integer.MIN_VALUE;
        int a=0,b=0;
        for(int i=0;i<arr.length;i++)
        {
           max=max+arr[i];
           
           if(max>maxSoFar)
           {
            maxSoFar=max;
            b=i;
           }

           if(max<0)
           {
            max=0;
            a=i+1;
           }

        }
        
        for(int i=a;i<=b;i++)
        System.out.println(arr[i]);

        return maxSoFar;
    }
}