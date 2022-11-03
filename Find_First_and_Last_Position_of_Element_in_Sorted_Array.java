class Solution {
       public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=fun(nums,target,true);
        if(ans[0]!=-1)
            ans[1]=fun(nums,target,false);
        return ans;
    }
    int fun(int[] nums,int target,boolean findStartIndex){
        System.out.println(findStartIndex);
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("start-->"+start+"mid-->"+mid+"end-->"+end);
            if (target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
