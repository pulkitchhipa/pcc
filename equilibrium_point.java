class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        int rightsum=0;
       int leftsum=0;
       int pos=-1;
       
       for(int i=0;i<n;i++){
           rightsum+=arr[i];
           
       }
       
       for(int i=0;i<n;i++){
           rightsum-=arr[i];
           
           if(leftsum==rightsum){
               pos = i+1;
               break;
           }
           
           leftsum+=arr[i];
       }
       
       return pos;
    }
}
