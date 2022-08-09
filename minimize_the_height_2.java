class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        if(n == 0){
            return 0;
        }   
        int min,max;
        int diff = arr[n - 1] - arr[0];
        for(int i = 1; i < n; i++){
            
            if(arr[i] - k < 0){
                continue;
            }
            min = Math.min(arr[i] - k,arr[0] + k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            
            diff = Math.min(diff, max - min);
        }
        
        return diff;
    }
}
