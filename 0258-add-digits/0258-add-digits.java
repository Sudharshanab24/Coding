class Solution {
    public int addDigits(int num) 
    {
        if(num<10) return num;
        
        int sum=0;
        int a=num;
        while(a!=0)
        {
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        
        return addDigits(sum);
    }
}