//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends

//Optimised Approach 1
// TC:O(n)
// SC:O(n)


class Solution 
{ String removeDups(String S) 
  { boolean[] seen = new boolean[256];//To store boolean value for each ASCII value Lowercase 
    StringBuilder res = new StringBuilder();// To use mutability
    for(int i=0;i<S.length();i++)    
    { char curr = S.charAt(i);   //checking for each character
      if (!seen[curr])           //if not seen 
      {  seen[curr] = true;      // make its boolean value true for further comparison
         res.append(curr);      // add to StringBuilder
      }
    }
    return res.toString();   // return StringBuilder after converting to string
  }
}
