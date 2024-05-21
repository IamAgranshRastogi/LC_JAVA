class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max=0,j=-1,i=0;
      for(i=0;i<nums.length;i++){
        if(nums[i]==0){
          max=Math.max(max,i-j-1);
          j=i;
        }
      }
      return Math.max(max,i-j-1); 
    }
}
// TC:O(n)  SC:O(1)