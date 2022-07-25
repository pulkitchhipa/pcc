class Solution {

    public long minValue(long a[], long b[], long nn) 
    {
        // Your code goes here
        int n = (int)nn;
        long sum = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            sum+=b[i]*a[n-i-1];
        }
        return sum;
    }
}
