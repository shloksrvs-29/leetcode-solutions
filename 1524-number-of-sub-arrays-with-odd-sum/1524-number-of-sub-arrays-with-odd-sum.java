class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd = 0;
        int even = 1;
        int ans = 0;
        int isOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            isOdd = (isOdd + arr[i]) % 2;

            if (isOdd == 1) {
                ans += even;
                odd++;
            } else {
                ans += odd;
                even++;
            }

            ans %= 1000000007;
        }

        return ans;
    }
}