class Solution
{
    public int[] dailyTemperatures(int[] temp)
    {
        int n=temp.length;
        int arr[]=new int[n];
        
        Deque<Integer> stack=new ArrayDeque<>();

        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i])
            {
                int ind=stack.pop();
                arr[ind]=i-ind;
            }
            stack.push(i);
        }

        return arr;
    }
}