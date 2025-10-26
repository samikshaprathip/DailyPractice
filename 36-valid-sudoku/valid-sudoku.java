class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap <Integer,Set<Character>> cols = new HashMap<>();
        HashMap <Integer,Set<Character>> rows = new HashMap<>();
        HashMap <String,Set<Character>> squares = new HashMap<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.')continue;
                String squarekey = (r/3) + "," + (c/3);
                if(rows.computeIfAbsent(r,k -> new HashSet<>()).contains(board[r][c])||
                cols.computeIfAbsent(c,k -> new HashSet<>()).contains(board[r][c])||
                 squares.computeIfAbsent(squarekey, k-> new HashSet<>()).contains(board[r][c])){
                    return false;
                }
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squarekey).add(board[r][c]);
            }
        }
        return true;
    }
}