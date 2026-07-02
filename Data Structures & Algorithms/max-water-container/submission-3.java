class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0,r = n - 1;
        int max = 0;
        while (l<r) {
            if (max < Math.min(heights[l],heights[r]) * (r - l)) {
                max = Math.min(heights[l],heights[r]) * (r - l);
            }
            if (heights[l] >= heights[r]) {
                r--;
            }
            else l++;
        }
        return max;
    }
}
