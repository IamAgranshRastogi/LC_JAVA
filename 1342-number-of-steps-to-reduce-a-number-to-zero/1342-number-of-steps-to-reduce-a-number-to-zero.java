class Solution 
{ public int numberOfSteps(int num)  
  { return helper(num,0); //calling helper with stepscount = 0
  }
  private int helper(int num,int steps) 
  { if(num==0)     //base case
    {  return steps;
    }
    if(num%2==0)  // for Even num divide num by 2 and increase steps count
    { return helper(num/2,steps+1);
    }
    return helper(num-1,steps+1); // if odd then reduce num by 1 and increase steps count
  }
}