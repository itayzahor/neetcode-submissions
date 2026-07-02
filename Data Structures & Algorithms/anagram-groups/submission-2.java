class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* good solution : we will sort each word */
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];
            for (char c : strs[i].toCharArray()) {
                arr[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : arr) {
                sb.append(num).append('#');
            }
            String s = sb.toString();
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
