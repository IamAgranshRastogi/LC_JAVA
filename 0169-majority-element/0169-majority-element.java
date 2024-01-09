// Much Much Better : Using Bit Manipulation
// TC : 32*O(n)*O(1) = O(n) 
// SC : O(1)

class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int mjrele = 0;
       for(int currbit= 0; currbit<32; currbit++) {
           int cntones=0;
           for(int i=0;i<n;i++) {
               if((nums[i] & (1 << currbit)) != 0){
                  cntones++;
               }
           }
           if(cntones > n/2) {
              mjrele |= (1 << currbit);
           }
       }
       return mjrele;
    }
}