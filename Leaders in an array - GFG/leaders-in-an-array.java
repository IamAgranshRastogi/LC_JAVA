//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

// } Driver Code Ends


class Solution
{ static ArrayList<Integer> leaders(int arr[], int n)
  { int max=Integer.MIN_VALUE; // Creating a max with a min possible value 
    ArrayList<Integer> leaderop=new ArrayList<>();
    for(int i=n-1;i>=0;i--)  //Checking from right 
    { if(arr[i]>=max) // if any ele is greater than or equal to Max
      { max=arr[i];  // update max
        leaderop.add(max); // Max will also be greater than all right elements
      }
    }
    Collections.reverse(leaderop); // to print output in the desired way
    return leaderop;
  }
}
