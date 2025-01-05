class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        
        StringBuilder sb=new StringBuilder();
        int curr=0;
        int tl[]=new int[s.length()+1];

        for(int i=0;i<shifts.length;i++)
        {
            int st=shifts[i][0];
            int e=shifts[i][1];
            int d=shifts[i][2];

            int diff=(d==1)?1:-1;

            tl[st]+=diff;
            tl[e+1]-=diff;
        }
        for(int i=0;i<s.length();i++)
        {
            curr=(curr+tl[i])%26;
            int n=(s.charAt(i)-'a'+curr+26)%26;
            sb.append((char)('a'+n));
        }

        return sb.toString();
    }
}