//TC:O((n)   
//SC:O(1)

class Solution 
{ public void rotate(int[] nums, int k) 
  { k=k%nums.length;
    revarr(nums,0,nums.length-1);
    revarr(nums,0,k-1);
    revarr(nums,k,nums.length-1);
  }
  public static void revarr(int nums[],int l,int r)
  { while(l<r)
    { int temp =nums[l];
      nums[l]=nums[r];
      nums[r]=temp;
      l++;
      r--;
    }
  }    
}