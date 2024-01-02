class Solution {
    public Solution(int m, int n) {
        this.rows= m;
        this.cols=n;
        this.total=m*n;  
    }
    
    public int[] flip() {
        if(used.size()==total)
          return new int[] {};
        int index = new Random().nextInt(total);
        while( used.contains(index))
         index = ++index % total;
         used.add(index);
     return new int[] {index / cols, index % cols};      
    }
    
    public void reset() {
        used.clear();
    }

    private Set<Integer> used = new HashSet<>();
    private int rows;
    private int cols;
    private int total;
}

// Time  Complexity: O(1) for [flip] , O(1) for [reset]
// Space Complexity: O(rows * cols)


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */