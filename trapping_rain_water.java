class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        long c=0;
        int l=0, r=n-1;
        int lmax=arr[0], rmax=arr[n-1];
        
        while(l<r) {
            if(arr[l] <= arr[r]) {
                if(arr[l] >= lmax)
                    lmax=arr[l];
                else
                    c+=lmax-arr[l];
                    l++;
            } else {
                if(arr[r] >= rmax)
                    rmax=arr[r];
                else
                    c+=rmax-arr[r];
                r--;
            }
        }
        
        return c;
    } 
}
