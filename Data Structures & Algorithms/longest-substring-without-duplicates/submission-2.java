class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0,max = 0;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                i = map.get(c);
                res = 0;
                map.clear();
            } else {
                map.put(c, i);
                res++;
            }
            max = Math.max(res,max);
        }
        return max;
    }
}
