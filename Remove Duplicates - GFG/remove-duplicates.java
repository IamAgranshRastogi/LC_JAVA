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

//Optimised Approach2
// TC:O(n)  
// SC:O(n)


class Solution 
{ String removeDups(String S) 
  { Set<Character> chSet = new HashSet<>();  // No duplicates can be stored
    StringBuilder res = new StringBuilder(); // To use mutability
    for (int i=0;i<S.length();i++) 
    { char curr=S.charAt(i);     // for each char in string
      if (!chSet.contains(curr)) //if set do not contains that char
      { chSet.add(curr);        // add that char to set for further comparison 
        res.append(curr);       // add that char to stringbuilder for output
      }
    }
    return res.toString();   // return stringbuilder after converting to string
  }
}