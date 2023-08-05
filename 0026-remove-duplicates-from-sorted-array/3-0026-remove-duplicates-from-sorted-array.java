class Solution 
{  public int removeDuplicates(int[] nums) 
   { Set<Integer> s=new TreeSet<Integer>();
    for(int i=0;i<nums.length;i++)
    { s.add(nums[i]);
    }
    int index=0;
    for(int j:s)
    { nums[index++]=j;
    }
    return index;
   }
}
