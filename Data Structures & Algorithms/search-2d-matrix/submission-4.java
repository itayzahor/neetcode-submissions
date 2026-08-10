class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rhigh = matrix[0].length - 1, clow = 0, chigh = matrix.length - 1,rlow = 0;
        while (chigh >= clow) {
            int cm = clow + ((chigh - clow) /2);
            if (matrix[cm][0] <= target && matrix[cm][rhigh] >= target) {
                while(rhigh >= rlow) {
                    int rm = rlow + ((rhigh-rlow)/2);
                    if (matrix[cm][rm] == target) {return true;} 
                    if (matrix[cm][rm] < target) {rlow = rm + 1;}
                    else {rhigh = rm - 1;}
                }
                return false;
            } 
            if (matrix[cm][0] < target) { clow = cm + 1;}
            else {chigh = cm - 1;}
        }
        return false;
    }
}
