class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        
        // Max score from left side
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
            maxsum = Math.max(lsum, maxsum);
        }
        
        int rind = cardPoints.length - 1;
        
        // Move 1 card left to right
        // Remove 1 card from right to left  
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rind];
            rind--;
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        
        return maxsum;
    }
}

// TC: O(n)    SC: O(1)