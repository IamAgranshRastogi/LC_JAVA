//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{ String reverseWords(String S)
  { String res=new String();
    int i=0;
    int n=S.length();
    while(i<n)
    { while(i<n && S.charAt(i)=='.')   i++;
      if(i>=n)  break;
      int j=i+1;
      while(j<n && S.charAt(j)!='.')   j++;
      String subs= S.substring(i,j);
      if(res.length()==0)    res=subs;
      else   res=subs+"."+res;
      i=j+1;
    }
    return res;
  }
}