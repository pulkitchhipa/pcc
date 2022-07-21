class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<n;i=i+k){
            int low=i;
            int high=Math.min(i+k-1,n-1);
            while(low<high){
                int temp = arr.get(low); 
                arr.set(low, arr.get(high)); 
                arr.set(high, temp);
                low++;
                high--;
            }
        }
    }
}
