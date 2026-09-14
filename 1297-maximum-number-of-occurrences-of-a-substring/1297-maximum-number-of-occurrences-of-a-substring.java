class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= s.length() - minSize; i++) {

            String sub = s.substring(i, i + minSize);

            HashSet<Character> set = new HashSet<>();

            for (char ch : sub.toCharArray()) {
                set.add(ch);
            }

            if (set.size() <= maxLetters) {
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
        }

        int ans = 0;

        for (int count : map.values()) {
            ans = Math.max(ans, count);
        }

        return ans;
    }
}