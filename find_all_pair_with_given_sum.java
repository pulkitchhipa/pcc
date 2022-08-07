class Solution {
    public pair[] allPairs( long a[], long b[], long n, long m, long x) {
        // Your code goes here 
        Arrays.sort(a);
       Arrays.sort(b);
       ArrayList<Long>bl=new ArrayList<>();
       for(int i=0;i<m;i++)
       {
           bl.add(b[i]);
       }
       ArrayList<Long> a1 = new ArrayList<>();
       ArrayList<Long> b1 = new ArrayList<>();
       
       for(int i=0;i<(int)n;i++)
       {
           long diff = x-a[i];
           if(bl.contains(diff))
           {
               a1.add(a[i]);
               b1.add(diff);
              // bl.set(bl.indexOf(diff),(long)Integer.MIN_VALUE);
           }
       }
       
       pair [] p = new pair[a1.size()];
       //System.out.println(b1);
       for(int i=0;i<a1.size();i++)
       {
           pair pr = new pair(a1.get(i),b1.get(i));
           p[i] = pr;
       }
       return p;
    }
}
