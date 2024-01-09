// Much Much Better : Using Randomized Approach
// TC : O(nlogn) 
// SC : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        while(true) {
          int randele = nums[randrange(0,n-1)];
          int k = cntfreq(nums,n,randele);
          if(k>n/2)  return randele;
       }
    }
    public int cntfreq(int nums[],int n,int val) {
       int cnt = 0;
       for(int i=0; i<n; i++)  {
           if(nums[i]==val) {
               cnt++;
           } 
       }
       return cnt; 
    }
    public int randrange(int min,int max) {
       return new Random().nextInt((max - min) + 1) + min;
    }
}
