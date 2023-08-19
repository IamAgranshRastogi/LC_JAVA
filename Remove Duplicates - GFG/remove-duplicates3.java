//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG 
{ public static void main(String args[]) throws IOException 
 { BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
   int t = Integer.parseInt(read.readLine());
   while (t-- > 0) 
   { String s = read.readLine();       
     Solution ob = new Solution();
     String result = ob.removeDups(s);         
     System.out.println(result);
   }
 }
}
// } Driver Code Ends



//------- Time limit will exceed------------

//Brute Force Approach
// TC:O(n^2)
// SC:O(n)

class Solution 
{ String removeDups(String S) 
  { StringBuilder res = new StringBuilder();  // To use Mutability
    for (int i=0;i<S.length();i++) 
    { char curr = S.charAt(i); //for each char
      boolean dupli = false;    // taking each char as not duplicate
      for (int j=i+1;j<S.length();j++) // check for next char
      { if (curr==S.charAt(j))   //for every char found dupli 
        { dupli=true;            // mark dupli as true 
          break;                //check for next char 
        } 
      }
      if (!dupli)              // if no duplicate found
      { res.append(curr);      //add to string builder
      }
    }
    return res.toString();  //return string builder after converting to string
  }
}
