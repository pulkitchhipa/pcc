class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int count = 0; count < n; count++){
            int index = count;
            int sum = 0;
            while(sum < s){
                sum+=arr[index];
                
                if(sum > s){
                    break;
                }
                
                if(sum == s){
                    result.add(count+1);
                    result.add(index+1);
                    return result;
                }
                index++;
                if(index >= n){
                    break;
                }
            }
        }
        
        result.add(-1);
        return result;
    }
    
}
