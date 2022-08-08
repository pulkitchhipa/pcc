class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        int p = 0;
        int jump = 0;
        
        if(n == 1){
            return 0;
        }
        
        while(p<n && p+arr[p] < n){
            
            if(arr[p] == 0){
                return -1;
            }
            
            if(p+arr[p] >= n-1){
                jump++;
                return jump;
            }
            
            int maxJumpIndex = p+arr[p];
            for(int tempPos = p; tempPos < p+arr[p]; tempPos++){
                
                if(arr[tempPos] != 0){
                    
                    if(maxJumpIndex+arr[maxJumpIndex] < tempPos+arr[tempPos]){
                        maxJumpIndex = tempPos;
                    }
                }
            }
            
            // System.out.print("-> "+maxJumpIndex);
            p = maxJumpIndex;
            jump++;
            
        }
        if(p<n-1){
            jump++;
            // System.out.print("--> "+(n-1));
        }
        // System.out.println(" ");
        return jump;
    }
}
