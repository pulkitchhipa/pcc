int binarysearch(int arr[], int n, int k) {
        // code here
        int end = arr.length - 1;
        int start = 0;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == k){
                return mid;
            }
            if(k > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
