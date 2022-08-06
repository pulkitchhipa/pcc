class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String prefix=arr[0];
        if(arr.length==0)
        return "";
        for(int i=1;i<n;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        if(prefix.length()==0)
        return "-1";
        return prefix;
    }
}
