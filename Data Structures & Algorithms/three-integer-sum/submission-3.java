class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1) {
                if (nums[i] == nums[i-1]) continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if(nums[left] + nums[right] + nums[i] == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                } 
                else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return list;
    }
}
