class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* good solution : we will sort each word */
        String[] s_sorted = new String[strs.length];
        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();   // turn into array
            Arrays.sort(chars);               // sort alphabetically
            String sorted = new String(chars);
            s_sorted[i] = sorted;
        }
        // we have an array
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < s_sorted.length; i++) {
            if (!map.containsKey(s_sorted[i])) {
                map.put(s_sorted[i], new ArrayList<>());
            }
            map.get(s_sorted[i]).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
