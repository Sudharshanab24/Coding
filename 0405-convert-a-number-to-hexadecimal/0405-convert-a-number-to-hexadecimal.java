class Solution {
    public String toHex(int num) 
    {
        if (num == 0) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

            long digit = num & 0xFFFFFFFFL;

            while(digit>0)
            {
            res.append(hex[(int)( digit%16)]);
            digit=digit/16;
            }
        

        return res.reverse().toString();
    }
}