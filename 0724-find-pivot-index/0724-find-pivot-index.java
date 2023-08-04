//TC: O(n)
//SC: O(1)

class Solution 
{ public int pivotIndex(int[] nums) 
  {    int sl=0;
       int sr=0;
       int n=nums.length;
       if(n==1)   // Single ele arr
       { return 0;
       }
       for(int i=0;i<n;i++) //Sum of all leaving first ele of arr in rightsum
       { sr+=nums[i];
       }
       for(int i=0;i<n;i++) //Comparing Leftsum and Rightsum
       {  sr -= nums[i];  // next ele decre in rightsum
          if(sl==sr)
          { return i; //1-based index
          }
          sl += nums[i];   //curr ele incre in leftsum
       }
       return -1;
  }
}