class Solution {

    public int maxScore(int[] cardPoints, int k) {

        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;
        int n = cardPoints.length;

        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        maxSum = lsum;

        for (int i = 0; i < k; i++) {

            lsum = lsum - cardPoints[k - 1 - i];

            rsum = rsum + cardPoints[n - 1 - i];

            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;
    }
}