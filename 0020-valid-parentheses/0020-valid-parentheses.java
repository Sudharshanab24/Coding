class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack=new Stack<>();

        int i=0;

        while(i<s.length())
        {
            char c=s.charAt(i);

            if(c=='[' || c=='{' || c=='(')   stack.push(c);

            else if(c==']' || c=='}' || c==')')  
            {
                if(stack.isEmpty()) return false;
                
                char ch=stack.pop();

                if((c==']' && ch!='[') || (c=='}' && ch!='{') || (c==')' && ch!='(')) return false;
            }

            i++;
        }

        if(stack.isEmpty()) return true;

        return false;
    }
}