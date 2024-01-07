// More Better : Divide and Conquer
// TC : O(nlogn) 
// SC : O(1)

class Solution {
    public int majorityElement(int[] nums) {
       return findmjrele(nums,0,nums.length-1);
    }
    
    public int cntfreq(int[] nums,int l,int r,int val) {
        int cnt = 0;
        for(int i=l;i<=r;i++) {
            if(nums[i] == val) {
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
    
    public int findmjrele(int nums[],int l,int r) {
        if(l==r){
            return nums[l];
        }
        
        int mid = l + (r-l)/2; 
        int leftmjr = findmjrele(nums,l,mid);
        int rightmjr = findmjrele(nums,mid+1,r);
        
        if(leftmjr==rightmjr) {
            return leftmjr;
        }
        
        int leftcnt=cntfreq(nums,l,r,leftmjr);
        int rightcnt=cntfreq(nums,l,r,rightmjr);
        
        if(leftcnt > (r-l+1)/2) {
           return leftmjr;    
        }
        else if(rightcnt > (r-l+1)/2) {
           return rightmjr;
        }
        else {
           return -1;
        }
    }
}
