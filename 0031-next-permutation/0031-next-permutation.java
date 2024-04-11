class Solution {
    public void nextPermutation(int[] nums) {
        int i1=-1,i2=0;  
        for(int i=nums.length-2;i>=0;i--){   
            if(nums[i]<nums[i+1]){
                i1=i;
                break;
            }
        }
        if(i1==-1){   
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>i1;i--){   
            if(nums[i1]<nums[i]){
                i2=i;
                break;
            }
        }
        swap(nums,i1,i2);   
        reverse(nums,i1+1,nums.length-1);   
    }
    void swap(int[] nums,int i,int j){   
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[] nums,int i,int j){   
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}