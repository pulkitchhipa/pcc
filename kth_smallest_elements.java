class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       countSort(arr,arr.length);
       return arr[k-1];
    } 
    public static int findmax(int[] arr, int n){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<n;i++)
            max=Math.max(max, arr[i]);
        return max;
    }
    public static void countSort(int[] arr, int n){
        int max= findmax(arr, n);
        int[] hash= new int[max+1];
        for( int i=0; i<n; i++)
            hash[arr[i]]++;
        int d=0;
        for( int i=0; i<max+1; i++){
            int count=hash[i];
            while(count>0){
                arr[d++]=i;
                count--;
            }
        }
    }
    
}

