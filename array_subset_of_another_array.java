class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if(a1.length < a2.length)
        {
            return "No";
        }
        HashMap<Long,Integer> map=new HashMap<>();
        for(int i=0;i<a1.length;i++)
        {
            map.put(a1[i],map.getOrDefault(a1[i],0)+1);
        }
        
        for(int i=0;i<a2.length;i++)
        {
            if(!map.containsKey(a2[i]))
            {
               return "No"; 
            }
            else
            {
                map.put(a1[i],map.get(a1[i])-1);
            }
        }
        return "Yes";
        
    }
}
