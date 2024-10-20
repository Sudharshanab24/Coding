class Solution {

    public int[] sorted(int[] arr)
    {
        Arrays.sort(arr);
        
        // Reverse the array manually
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        // Return the sorted and reversed array
        return arr;
    }
    public String[] findRelativeRanks(int[] score)
    {
         int[] arr=sorted(Arrays.copyOf(score, score.length));
         String str[]=new String[score.length];

         HashMap<Integer,Integer>hm=new HashMap<>();

         for(int i=0;i<score.length;i++)
         hm.put(score[i],i);

         for(int i=0;i<arr.length;i++)
         {
            int d=hm.get(arr[i]);
            if(i==0) str[d]="Gold Medal";
            else if(i==1) str[d]="Silver Medal";
            else if(i==2) str[d]="Bronze Medal";
            else str[d]=String.valueOf(i+1);
         }
       return str;
    }
}