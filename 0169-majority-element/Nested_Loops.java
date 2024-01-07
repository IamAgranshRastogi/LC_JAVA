class Solution {
    public int majorityElement(int[] nums) {
       int y=0;
       for(int i=0;i<nums.length;i++){
           int majcnt=0;
           for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j])
                   majcnt++;
           }
           if(majcnt>nums.length/2)
               y=nums[i];
       }
       return y;
    }
}
// Brute Force Approach : Nested Loops
// TC : O(n^2)
// SC : O(1)
