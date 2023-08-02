// 3 pointer approach 

/* Low P : To sort all 0s
   Mid P: To sort all 1s
   High P: To sort all 2s
*/


class Solution 
{ public void sortColors(int[] nums) 
  { int low=0;
    int mid=0;
    int high=nums.length-1;
    int tmp=0;
    
   while(mid<=high) // Stopping Condition when all 1s at left of mid and all 2s at right of high
   { switch (nums[mid])
     { case 0:{ tmp=nums[low]; 
                nums[low]=nums[mid];
                nums[mid]=tmp;
                low++;
                mid++;
                break;
              }
      case 1:{ mid++;
               break;
             }
      case 2:{ tmp=nums[high];
               nums[high]=nums[mid];
               nums[mid]=tmp;
               high--;
               break;
             }
     }
   }
   
  }
}