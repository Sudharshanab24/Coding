class Solution 
{
    public boolean isSubsequence(String s, String t)
    {
        int m=s.length();
        int n=t.length();

        int i=0,j=0;
        int c=0;

        while(i<n && j<m)
        {
            if(t.charAt(i)==s.charAt(j))
            {
                c++;
                j++;
            }
            i++;
        }

        if(c==m) return true;

        return false;
    }
}