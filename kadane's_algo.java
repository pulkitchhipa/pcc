class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int maxSum=0;
        int maxValue=Integer.MIN_VALUE;
        int negCount=0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<0){
                maxValue=arr[i]>maxValue?arr[i]:maxValue;
                negCount++;
            }
                
                
            sum+=arr[i];
            
            maxSum=sum>maxSum?sum:maxSum;
            
            if(sum<0)
                sum=0;
        }
        
        if(negCount==arr.length){
            return maxValue;
        }
            
        
        return maxSum;
    }
    
}

