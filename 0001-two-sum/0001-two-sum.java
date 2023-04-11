class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {  /*for(int i=0;i<nums.length;i++)
      { for(int j=i+1;j<nums.length;j++)
         { if(nums[j]==target-nums[i])
            { return new int[]{i,j}; }
          }
      }
       return null;
  */ 
    /*int [] result =new int[2];
        Map map =new HashMap();
        for(int i=0;i<numbers.length;i++)
        { if(!map.containsKey(target-numbers[i]))
          {map.put(numbers[i],i);
          }
         else
         {
             result[1]=i;
         result[0]=map.get(target-numbers[i]);
         return result; 
         }
         return result;
         */
     Map<Integer,Integer> mp = new HashMap<>();
    int [] ans = new int[2];
    int n = nums.length;
    for(int i = 0; i < n;i++)
    {
        if(mp.containsKey(target - nums[i]))
        {
            ans[1] = i;
            ans[0] = mp.get(target - nums[i]);
            return ans;
        }
        mp.put(nums[i],i);
    }
    
    return ans;
    
    
    }
}