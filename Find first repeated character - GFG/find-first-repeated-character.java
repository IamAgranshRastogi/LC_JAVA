//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends

//TC:O(n)
//SC:O(1)

//User function Template for Java
class Solution 
{ String firstRepChar(String s) 
    { char ele=0;
      String b="";
      ArrayList<Character> a=new ArrayList<Character>();
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++)
      { if(!a.contains(ch[i]))
        { a.add(ch[i]);
        }
        else if(a.contains(ch[i]))
        { ele=ch[i];
          b=b+ch[i];
          return b;
        }
      }
      return "-1";
    }
} 