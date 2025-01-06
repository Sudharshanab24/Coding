class Solution {
    public int[] minOperations(String boxes)
    {
        int [] arr=new int[boxes.length()];
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<boxes.length();i++)
        {
            int b=boxes.charAt(i)-'0';
            if(b==1)
            list.add(i);
        }

        for(int i=0;i<boxes.length();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                arr[i]=Math.abs(i-list.get(j))+arr[i];
            }
        }

        return arr;
    }
}