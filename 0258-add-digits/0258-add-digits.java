class Solution {
    public int addDigits(int num) 
    {
        int sum=0;
        int a=num;
        while(a!=0)
        {
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        if(sum>=0 && sum<=9)
        return sum;
        else
        return addDigits(sum);
    }
}