class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int multiPrefix = 1, multiSuffix = 1;
        for (int i = 0; i <nums.length; i++) {
            prefix[i] = multiPrefix;
            suffix[nums.length - 1 - i] = multiSuffix;
            multiPrefix *= nums[i];
            multiSuffix *= nums[nums.length - 1 - i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}  
