class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length+nums2.length];
        int i=0,j=0,k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            }
            else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        double midean;
        if(nums3.length%2==0){
            midean=(nums3[(nums3.length/2)-1]+nums3[(nums3.length/2)])/2.0;
        }
        else{
            midean=nums3[(nums3.length/2)];
        }
        return midean;
    }
}   
