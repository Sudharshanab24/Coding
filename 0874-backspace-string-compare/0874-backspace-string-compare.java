class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack <Character> stack1=new Stack<>();int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='#' && !stack1.empty()) stack1.pop();
            else if(s.charAt(i)!='#') stack1.push(s.charAt(i));
            i++;
        }

        Stack <Character> stack2=new Stack<>();i=0;
        while(i<t.length())
        {
            if(t.charAt(i)=='#' && !stack2.empty()) stack2.pop();
            else if(t.charAt(i)!='#') stack2.push(t.charAt(i));
            i++;
        }

        while(!stack1.empty() && !stack2.empty())
        {
            if(stack1.pop()!=stack2.pop()) return false;
        }

        if(stack1.empty() && stack2.empty()) return true;
        return false;
        
        


    }
}