class Solution {
    public int compress(char[] chars)
    {
        int j=0;

        for(int i=0;i<chars.length;i++)
        {
            int c=1;
            char ch=chars[i];
            while(i+1<chars.length && chars[i+1]==ch)
            {
                c++;
                i++;
            }

            chars[j]=ch;
            j++;
             
            if(c>1)
            {
            for(char cha:String.valueOf(c).toCharArray())
            {
            chars[j]=cha;
            j++;
            }
            }
        }

        return j;
    }
}