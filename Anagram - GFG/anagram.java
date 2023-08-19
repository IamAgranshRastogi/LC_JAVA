//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends

//TC: O(|S|log|S|)
//SC:O(|S|)            :. Len(String)=|S|

//Brute Force Approach
class Solution
{  public static boolean isAnagram(String a,String b)
   { //Removing Space and converting to Lowercase for easy comparison
     a=a.replaceAll("\\s","").toLowerCase();
     b=b.replaceAll("\\s","").toLowerCase();
     
     // Case : Unequal length => can't be Anagram
     if(a.length()!=b.length()) return false;
     
     //For comparing elements 
     char c1[]=a.toCharArray();
     char c2[]=b.toCharArray();
     
     //sorting will make arrays equal if really Anagram
     Arrays.sort(c1);
     Arrays.sort(c2);
     return Arrays.equals(c1,c2);
   }
}