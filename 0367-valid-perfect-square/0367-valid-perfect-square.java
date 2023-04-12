class Solution 
{ public boolean isPerfectSquare(int num) 
  {  long l=0;                     // Use Binary Search Approach
     long r=num;
     long mid=l+(r-l)/2;
     while(l<=r)        
     {  if(mid*mid==num)
        {   return true; 
        }
        if(mid*mid<num)  
        { l=mid+1;
        }
        else
        { r=mid-1; 
        }
        mid=l+(r-l)/2;         
     }
        return false; 
  }
}