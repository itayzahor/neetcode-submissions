class Solution {
    public int search(int[] nums, int target) {
         int l = 0, r = nums.length,m;
         while (r>=l) {
            m = (r+l)/2;
            if (m>= nums.length) {return -1;}
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) { r = m-1;}
            else {l = m+1;}
         }
         return -1;
    }
}
