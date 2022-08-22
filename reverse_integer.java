import java.lang.Math;
class Solution {
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
            sum = sum*10 + x%10; 
            x = x/10;
        }
        if(sum > (Math.pow(2, 31) - 1) || sum < -(Math.pow(2, 31))){
            return 0;   
        }
        return (int) sum;
    }
}
