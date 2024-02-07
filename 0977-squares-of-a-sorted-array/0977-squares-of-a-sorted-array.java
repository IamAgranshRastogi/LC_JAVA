class Solution {
    public int[] sortedSquares(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int ans[]=new int[nums.length];
        int k=ans.length-1;
        
        while(s<=e){
            int s_el=nums[s];
            int e_el=nums[e];
            if(s_el*s_el>e_el*e_el){
                ans[k]=s_el*s_el;
                k--;
                s++;
            }
            else{
                ans[k]=e_el*e_el;
                k--;
                e--;
            }
        }
        return ans;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)