class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // lower case letters = size 26
        int[] letters = new int[26];
        for(char c:s1.toCharArray()) {
            letters[c - 'a']++;
        }
        int left = 0, count = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            letters[c - 'a']--;
            count--;
            while (letters[c - 'a'] == -1 && left < s2.length()) {
                letters[s2.charAt(left) - 'a']++;
                left++;
                count++;
            }
            if (count == 0) return true;
        }
        return false;
    }
}
