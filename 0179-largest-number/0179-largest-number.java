class Solution {
    public String largestNumber(int[] nums)
    {
        List <String> str=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        str.add(String.valueOf(nums[i]));

        str.sort((str1,str2)->(str2+str1).compareTo(str1+str2));

        if("0".equals(str.get(0))) return "0";

        return String.join("",str);
    }
}