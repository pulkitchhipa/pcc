class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for(int i=0,j=height.length-1;i<j;) {
            if(height[i]<=height[j]) {
                maxarea = maxarea<(height[i]*(j-i))?(height[i]*(j-i)):maxarea;
                i=i+1;
            }
            else {
                maxarea = maxarea<(height[j]*(j-i))?(height[j]*(j-i)):maxarea;
                j=j-1;
            }
        }
        return maxarea;
    }
}
