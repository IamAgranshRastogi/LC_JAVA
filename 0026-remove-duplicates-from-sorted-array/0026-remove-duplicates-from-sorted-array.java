//TC:O(n)
//SC:O(n)

//Two pointer Approach
class Solution 
{  public int removeDuplicates(int[] nums) 
   { int i = 0;  // For Bringing all uniq ele to start
     for (int j = 1; j < nums.length; j++)
     { if (nums[i] != nums[j]) 
       { i++;
         nums[i] = nums[j];
       }
     }
     return i + 1;
   }
}