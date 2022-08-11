class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
       long result=sort(arr, 0, (int)N-1);
        return result;
        
    }
    static long sort(long arr[],int l,int r)
    {
        long count=0;
        if(l<r)
        {
            int m=(l+r)/2;
            count+=sort(arr,l,m);
            count+=sort(arr,m+1,r);
            count+=merge(arr,l,m+1,r);
        }
        return count;
    }
    static long merge(long arr[],int l,int m,int r)
    {
        long le[]=Arrays.copyOfRange(arr,l,m);
        long ri[]=Arrays.copyOfRange(arr,m,r+1);
        int i=0,j=0,k=l;
        long count =0;
        
        while(i<le.length && j <ri.length)
        {
            if(le[i]<=ri[j])
            {
                arr[k++]=le[i++];
                
            }
            else
            {
                arr[k++]=ri[j++];
                count+=m-(l+i);
            }
        }
        while(i<le.length)
        {
            arr[k++]=le[i++];
        }
        while(j<ri.length)
        {
            arr[k++]=ri[j++];
        }
        return count;
    }
}
