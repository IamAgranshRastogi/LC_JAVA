// Brute Force
//TC:O((k%n)*n)   // Time Limit will Exceed
//SC:O(1)

class Solution 
{ public void rotate(int[] nums, int k) 
  {  int temp=0;
     int n=nums.length;
   
     for(int j=0;j<k%n;j++)
     { temp=nums[n-1];
       for(int i=n-2;i>=0;i--)
       { nums[i+1]=nums[i];
       }
       nums[0]=temp;
     }
  }
}
