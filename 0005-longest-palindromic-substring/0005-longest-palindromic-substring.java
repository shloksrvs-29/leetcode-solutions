class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {
            int len = 0;

            for (int j = i; j < n; j++) {
                len = j - i + 1;

                boolean palindrome = true;

                int left = i;
                int right = j;

                while (left < right) {
                    char ch1 = s.charAt(left);
                    char ch2 = s.charAt(right);

                    if (ch1 != ch2) {
                        palindrome = false;
                        break;
                    }

                    left++;
                    right--;
                }

                if (palindrome && len > max) {
                    max = len;
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }
}