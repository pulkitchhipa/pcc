class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        int sign;
        if(x > 0)
            sign = 0;
        else
            sign = -1;
        while(x!=0) {
            sum = sum * 10 + x%10;
            x = x/10;
        }
        if(sign < 0)
            sum = -sum;
        if(sum == temp)
            return true; 
        else
            return false;
    }
}
