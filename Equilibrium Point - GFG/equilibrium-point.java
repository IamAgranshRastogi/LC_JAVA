//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution 
{   //Equilibrium point :Sum of ele at left = Sum of ele at right
    public static int equilibriumPoint(long arr[], int n) 
    {  int sl=0;
       int sr=0;
       if(n==1)   // Single ele arr
       { return 1;
       }
       for(int i=1;i<n;i++) //Sum of all leaving first ele of arr in rightsum
       { sr+=arr[i];
       }
       for(int i=0;i<n-1;i++) //Comparing Leftsum and Rightsum
       {  if(sl==sr)
          { return i+1; //1-based index
          }
          sl += arr[i];   //curr ele incre in leftsum
          sr -= arr[i+1];  // next ele decre in rightsum
       }
       return -1;
    }
}
