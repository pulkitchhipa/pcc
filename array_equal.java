class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Map<Long, Long> hm = new HashMap<>();
        for(int i = 0; i < N; i++) {
            long of = hm.getOrDefault(A[i], (long)0);
            hm.put(A[i], of+1);
        }
        for(int i = 0; i < N; i++) {
            if(!hm.containsKey(B[i])) return false;
            if(hm.get(B[i]) == 0) return false;
            long count = hm.get(B[i]);
            count--;
            hm.put(B[i], count);
        }
        return true;
    }
}
