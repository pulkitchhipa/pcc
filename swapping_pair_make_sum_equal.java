class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        long sumA = 0;
        long sumB = 0;
        for(int i = 0; i < A.length ; i++){
            sumA += A[i];
        }
        
        for(int i = 0; i < B.length ; i++){
            sumB += B[i];
        }
        long effectiveDiff = 0;
        int j = 0;
         int k = 0;
         long effSumA = 0;
         long effSumB = 0;
          while(j < A.length && k < B.length){
              effectiveDiff =  A[j] - B[k];
              effSumA = sumA -effectiveDiff;
              effSumB = sumB + effectiveDiff;
              if(effSumA == effSumB){
                  return 1;
              }
              else if(effSumA > effSumB){
                  j++;
              }
              else{
                  k++;
              }
          }
        return -1;
    }
}
