class Solution {
    public String countAndSay(int n) 
    {
        if(n<=0) return "";

        String str="1";
    
        while(n>1)
        {
            StringBuilder cur=new StringBuilder();
            for(int i=0;i<str.length();i++)
            {
                int count=1;
                    
                    while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) 
                    {
                        count++;
                        i++;
                    }
               cur.append(count).append(str.charAt(i));
            }
           str=cur.toString();
           n--;
        }
        return str;
    }
}