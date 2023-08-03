/*Better Approach:-
  Time Complexity = O(n).
  Space Complexity = 0(1)
*/
class Solution 
{ public void duplicateZeros(int[] arr) 
  {  if(arr.length==1) 
     { return;
     }
     int l=0;      
     int r=arr.length-1;
     while(l<r)     
     { if(arr[l]==0)
       { r--;  
       }
       l++;
     }
     if(r==arr.length-1)  
     { return;
     }
     for(int i=arr.length-1;i>=0 && r>=0;i--,r--)
     { arr[i]=arr[r];
      if(r!=l && arr[r]==0)
      { arr[i-1]=0;
        i--;
      }
     }
  }
}