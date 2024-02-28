class Solution {
    public void setZeroes(int[][] mx) {
      int m=mx.length;
      int n=mx[0].length;
// Taking 0th col ele as Row Mark
// Taking 0th row ele as Col Mark but from  1st col
      int col0=1; // For 0th col in Row Mark creating a variable col0 not equal to 0.
    
//  Setting Row Mark and Col Mark    
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mx[i][j]==0){  
                mx[i][0]=0;   //    Row Mark[i]=0 
                if(j==0){     //    If Element 0 found in 0th column
                    col0=0;   //        Col Mark[0]=0
                }
                else{         //    Else
                    mx[0][j]=0; //     Col Mark[j]=0
                }
            }
         }
       }
        
// Setting all remaining matrix based on Row Mark and Col Mark           
      for(int i=1;i<m;i++){      //Excluding Row Mark and Col Mark
        for(int j=1;j<n;j++){    
            if(mx[i][j]!=0){        //Checking only on basis of Row Mark and Col Mark               
                if(mx[0][j]==0||mx[i][0]==0){   
                   mx[i][j]=0;                 
                }
            }
        }
      }

      if(mx[0][0]==0){      // IF Row Mark[0] = 0
        for(int j=0;j<n;j++){ 
            mx[0][j]=0;
        }
      }
      if(col0==0){          // IF Col Mark[0] = col0 = 0
        for(int i=0;i<m;i++){ 
           mx[i][0]=0;     
        }
      }
    }
}

// TC:O(m*n)
// SC:O(1)