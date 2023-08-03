/* Brute Force Approach 
     * (1) Traverse array till length-1.
     * (2) If the element where you current at is zero then shift all the elements
           including zero to one step ahead.
     * (3) Don't forget increment the pointer by 1 else array will filled by 0s.
     * Time Complexity = O(n^2) for traversing & shifting.
     * Space Complexity = 0(1).
*/
class Solution 
{ public void duplicateZeros(int[] arr) 
  { int n=arr.length;
    for(int i=0;i<n-1;i++)
    { if(arr[i]==0)
      { for(int j=n-2;j>=i;j--)
        { arr[j+1]=arr[j];
        }
        i++;
      }
    }
  }
}
