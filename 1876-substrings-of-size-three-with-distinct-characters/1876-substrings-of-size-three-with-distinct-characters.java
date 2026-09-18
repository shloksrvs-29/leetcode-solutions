class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        String st = "";
        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            st = "";
            for (int j = i; j < n; j++) {
                st = st + s.charAt(j);
            }
            if (st.charAt(0) != st.charAt(1) &&
                    st.charAt(1) != st.charAt(2) &&
                    st.charAt(0) != st.charAt(2)) {

                count++;
            }
        }
        return count;
    }
}