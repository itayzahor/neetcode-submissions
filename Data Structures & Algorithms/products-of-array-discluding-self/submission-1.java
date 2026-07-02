class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length && countZero <= 1; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }
        if (countZero > 1) return new int[nums.length];
        int[] ans = new int[nums.length];
        if (countZero == 1) {
            int multi = 1,index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    index = i;
                } else {
                    multi *= nums[i];
                }
            }
            ans[index] = multi;
            return ans;
        }
        long multi = 1;
        for (int num : nums) {
            multi *= num;
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) multi / nums[i];
        }
        return ans;
    }
}  
