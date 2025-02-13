class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();

        for(String token:tokens)
        {
            if(token.matches("-?\\d+"))
            st.push(Integer.parseInt(token));

            else if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            {
                int n2=st.pop();
                int n1=st.pop();

                switch(token)
                {
                    case "+":
                    st.push(n1+n2);
                    break;

                    case "-":
                    st.push(n1-n2);
                    break;

                    case "*":
                    st.push(n1*n2);
                    break;

                    case "/":
                    st.push(n1/n2);
                    break;
                }
            }
        }

        return st.pop();
        
    }
}