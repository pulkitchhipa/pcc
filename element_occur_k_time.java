class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
       HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.replace(a[i],h.get(a[i])+1);
            }else{
                h.put(a[i],1);
            }
            if(h.containsKey(a[i])){
                int count=h.get(a[i]);
                if(count==k){
                    return a[i];
                }
            }
        }
        return -1;
    }  
    
}
