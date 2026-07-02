class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0,r = n - 1;
        int lh = 0, rh = n - 1;
        int max = Math.min(heights[l], heights[r]) * (n-1);
        l++;
        r--;
        while (l<r) {
            if (max < Math.min(heights[lh],heights[r]) * (r - lh)) {
                rh = r;
                max = Math.min(heights[lh],heights[r]) * (r - lh);
            }
            if (max < Math.min(heights[l],heights[rh]) * (rh - l)) {
                lh = l;
                max = Math.min(heights[l],heights[rh]) * (rh - l);
            }
            if (max < Math.min(heights[l],heights[r]) * (r - l)) {
                rh = r;
                lh = l;
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
