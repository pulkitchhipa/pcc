class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(numRows<=0)
        {
            return list;
        }
        for(int i=0;i<numRows;i++)
        {
            List<Integer> l1 = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    l1.add(1);
                }
                else
                {
                    l1.add(list.get(i-1).get(j-1)+ list.get(i-1).get(j));
                }
            }
            list.add(l1);
        }
        return list;
    }
}
