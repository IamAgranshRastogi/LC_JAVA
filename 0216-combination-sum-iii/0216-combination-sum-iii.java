class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res = new ArrayList<>();
      bcktrk(1, k, n, new ArrayList<>(), res);
      return res;
  }

  public void bcktrk(int start, int k, int n, List<Integer> curr, List<List<Integer>> res) {
     if (n < 0) return;
     if (curr.size() == k) {
        if (n == 0) {
             res.add(new ArrayList<>(curr));
        }
     return;
     }

     for (int i = start; i <= 9; i++) {
        curr.add(i);
        bcktrk(i + 1, k, n - i, curr, res);
        curr.remove(curr.size() - 1); 
     }
   }
}
// Time  Complexity: O(9^k)
// Space Complexity: O(k)

// where:
// k = number of elements in each combination