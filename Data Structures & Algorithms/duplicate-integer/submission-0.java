class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                return true;
            } else {
                hm.put(num, num);
            }
        }
        return false;
    }
}