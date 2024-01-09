// Much Better : Using Hash Table
// TC : O(n) 
// SC : O(n)

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> H = new HashMap<>();
        for (int i = 0; i < n; i++) {
            H.put(nums[i], H.getOrDefault(nums[i], 0) + 1);
            if (H.get(nums[i]) > n / 2) {
                return nums[i];
            }
        }
        return -1; // any default value if no majority element found
    }
}