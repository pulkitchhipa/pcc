class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];
            if (map.containsKey(neededValue)) {
                result[0] = i;
                result[1] = map.get(neededValue);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
