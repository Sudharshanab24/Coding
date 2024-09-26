class Solution
{
    public int longestPalindrome(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++)
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);

        int c=0;

        if(hm.size()==1) return s.length();

        int found=0;

        for(Integer i:hm.values())
        {
            if(i%2==0)
                c=c+i;

            else
            {
                c=c+(i-(i%2));
                found=1;
            }
        }
    
        if(found==1) c++;

        return c;
    }
}