// Most Better : Using Boyer-Moore Voting Approach
// TC : O(n) 
// SC : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int mjrcandidate = 0;
        for(int i=0; i<n;i++) {
          if(cnt==0) {
             mjrcandidate = nums[i]; 
          }
          if(nums[i] ==mjrcandidate) {
             cnt++;
          }
          else {
             cnt--;
          }
        }
        return mjrcandidate;
    }
}
