class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        // al.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            
            if(arr[i]<arr[i+1]){
                arr[i]=arr[i+1];
            }else{
                if(arr[i] == arr[i+1]){
                    hm.put(arr[i],hm.get(arr[i])+1);
                    continue;
                }
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                al.add(arr[i]);
                if(hm.get(arr[i])>1){
                    int k = hm.get(arr[i]);
                    while(k>1){
                        al.add(arr[i]);
                        k--;
                    }
                }
            }
        }
        if(al.size()==0 || arr[n-1]!=al.get(al.size()-1))al.add(arr[n-1]);
        return al;
    }
}
