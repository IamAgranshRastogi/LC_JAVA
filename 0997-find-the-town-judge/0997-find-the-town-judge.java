class Solution 
{  public int findJudge(int n, int[][] trust)
  {   int count[] = new int[n+1];  //trust count
      for(int p[] : trust) //pair in trust
      {  
         count[p[0]]--;     // outdegree
         count[p[1]]++;   // indegree
      }
      for(int i=1;i<=n;i++)
      {  if(count[i]==n-1)   
         { return i;
         }
      } 
      return -1;  
    }
}