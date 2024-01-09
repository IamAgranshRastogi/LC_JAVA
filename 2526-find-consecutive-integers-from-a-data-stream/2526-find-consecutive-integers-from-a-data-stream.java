// Using Counting
// TC: O(n)
// SC: O(1)

class DataStream {
    public int value;
    public int size;
    public int count;
    
    public DataStream(int value, int k) {
        this.value = value;
        this.size = k;
        this.count = 0;
    }
    
    public boolean consec(int num) {
       if (num == value) {
            count++;
       } else {
            count = 0;
       }
       return count >= size;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
