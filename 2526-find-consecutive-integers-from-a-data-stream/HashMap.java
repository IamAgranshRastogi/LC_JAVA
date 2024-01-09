// Using HashMap
// TC: O(n)
// SC: O(1)

class DataStream {
    HashMap<Integer,Integer>map;
    int k;
    int value;
    public DataStream(int value, int k) {
        map=new HashMap<>();
        this.k=k;
        this.value=value;
    }
    
    public boolean consec(int num) {
      if(num!=value){
            map.clear();
            return false;
        }

      if(!map.containsKey(num)){
          map.put(num,1);
      }

      else{
          map.put(num,map.getOrDefault(num,0)+1);
        }
        return map.get(num)>=k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
