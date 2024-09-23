class Solution {
    public int addDigits(int num) {
        // if num is zero then return
        if(num == 0) return 0;
        // if num is rather  than zero modulo it with 9 bcoz the sum of
        // two num is going only to nine then come up to its module with nine only.
        return num%9 == 0 ? 9 : num%9;
    }
}