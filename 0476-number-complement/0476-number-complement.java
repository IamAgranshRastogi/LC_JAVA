class Solution 
{ public int findComplement(int num) 
  {  if(num==0) return 1;
       int bitLen=(int)(Math.log(num)/Math.log(2)) + 1 ;
       int msk=(1<<(bitLen)) -1;
       return msk^num;
  }
}