class Solution {
    void zigZag(int arr[], int n) {
        boolean flag =true;
        for(int i=0; i<n-1; i++){
            if(flag){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
                flag = !flag;
            }else{
                if(arr[i] < arr[i+1]){
                    swap(arr, i, i+1);
                }
                flag = !flag;
            }
        }
    }
    
    void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
