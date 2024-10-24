class Solution {
    public int fib(int n) {
        // int a=-1;
        // int b=1;
        // int c=0;
        // for(int i=0;i<=n;i++)
        // {
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }

        // return c;
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }
}