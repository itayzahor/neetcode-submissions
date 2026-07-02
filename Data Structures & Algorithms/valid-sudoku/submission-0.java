class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character,Boolean> map = new HashMap<>();
        // check rows
        for (int i = 0; i < 9; i++) {
            map.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (map.getOrDefault(board[i][j], false)) {
                    return false;
                }
                map.put(board[i][j],true);
            }
        }
        // check lines
        for (int i = 0; i < 9; i++) {
            map.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (map.getOrDefault(board[j][i], false)) {
                    return false;
                }
                map.put(board[j][i],true);
            }
        }
        for (int k = 0; k < 9; k +=3) {
            for (int l = 0; l < 9;l+=3) {
                map.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i + k][j + l] == '.') continue;
                        if (map.getOrDefault(board[i + k][j + l], false)) {
                            return false;
                        }
                        map.put(board[i + k][j + l],true);
                    }
                }
            }
        }
        return true;
    }
}
