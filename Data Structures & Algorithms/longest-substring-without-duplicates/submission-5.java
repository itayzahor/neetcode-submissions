class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> set = new HashMap<>();
        int res = 0,max = 0;
        for (int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (set.containsKey(c)) {
                if (res < i - set.get(c)) {
                    res++;
                } else {
                    res = i - set.get(c);
                }
                set.replace(c, i);
            } else {
                set.put(c, i);
                res++;
            }
            max = Math.max(res,max);
        }
        return max;
    }
}
