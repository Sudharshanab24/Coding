class Solution {
    public int calculate(String s) {

        Stack<Integer> st=new Stack<>();

        int num=0,res=0,sv=1;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(Character.isDigit(c))
            num=num*10+(c-'0');

            else if(c=='+' || c=='-')
            {
                res=res+(num*sv);
                sv=(c=='-')?-1:1;
                num=0;
            }

            else if(c=='(')
            {
                st.push(res);
                st.push(sv);
                res=0;
                sv=1;
            }

            else if(c==')')
            {
                res=res+(num*sv);
                res*=st.pop();
                res+=st.pop();
                num=0;
            }


        }

        return res+(num*sv);
        
    }
}