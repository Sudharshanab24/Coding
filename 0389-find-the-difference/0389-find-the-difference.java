class Solution {
    public char findTheDifference(String s, String t) {
        
       //MAKING S AND T CHAR ARRAY
       char arr1[] = s.toCharArray();
       char arr2[] = t.toCharArray();
        
       //SORTING BOTH THE ARRAYS
       Arrays.sort(arr1);
       Arrays.sort(arr2);
        
        //BY USING FOR LOOP 
        //IF ANY ELEMENT OF STRING IS DIFFERENT 
        //RETURN ELEMENT OF ARR2
        for(int i =0; i<arr1.length; i++)
        {
            if(arr1[i] != (arr2[i]))
            {
                return arr2[i];
            }
        }
        
        
        return arr2[arr2.length-1];
    }
}