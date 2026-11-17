class Solution {
    public int reverse(int x) {
        long ans = 0; // use long to safely detect overflow before casting to int

        while (x != 0) {
            int digit = x % 10;   // pop last digit (works fine with negatives in Java)
            x /= 10;
            ans = ans * 10 + digit;

            if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
                return 0;
            }
        }

        return (int) ans;
    }
}