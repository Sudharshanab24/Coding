class Solution
{
    public int countBinarySubstrings(String s)
    {
        int c=1;
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                c++;
            }
            else
            {
            li.add(c);
            c=1;
            }
        }         

        li.add(c);
        int res=0;

        for(int i=1;i<li.size();i++)
            res=res+Math.min(li.get(i-1),li.get(i));

        return res;
    }

}