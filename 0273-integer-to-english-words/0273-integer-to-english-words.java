class Solution
{
    private final String[] b20={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num)
    {
       return (num==0) ? "Zero":helper(num);
    }
    public String helper(int num)
    {
        StringBuilder sb=new StringBuilder();

        if(num<20) sb.append(b20[num]);
        else if(num<100) sb.append(tens[num/10]).append(" ").append(b20[num%10]);
        else if(num<1000) sb.append(helper(num/100)).append(" Hundred ").append(helper(num%100));
        else if(num<1000000) sb.append(helper(num/1000)).append(" Thousand ").append(helper(num%1000));
        else if(num<1000000000) sb.append(helper(num/1000000)).append(" Million ").append(helper(num%1000000));
        else  sb.append(helper(num/1000000000)).append(" Billion ").append(helper(num%1000000000));
        

        return sb.toString().trim();
    }
}