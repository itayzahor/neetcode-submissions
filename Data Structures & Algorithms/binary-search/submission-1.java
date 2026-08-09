class Solution {
    public int search(int[] nums, int target) {
        if (nums[0] == target) return 0;
        int i = 0;
        while ((1 << i) < nums.length && nums[1 << i] <= target) {
            if (nums[1 << i] == target) return 1 << i;
            i++;
        }
        int start = i > 0 ? (1 << (i - 1)) : 0;
        for(int j = start; j < nums.length && j < (1 << i); j++) {
            if(target == nums[j]) {
                return j;
            }
        }
        return -1;
    }
}
