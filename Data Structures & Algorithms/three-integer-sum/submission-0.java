class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if(nums[left] + nums[right] + nums[i] == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    set.add(l);
                    left++;
                    right--;
                } 
                else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return set.stream().toList();
    }
}
