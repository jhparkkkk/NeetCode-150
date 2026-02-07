import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows =  new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r=0; r<board.length; r++){
            for (int c=0; c<board.length; c++ ){
                System.out.print(board[r][c]);

                if (board[r][c] == '.') { continue;}

                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());
                squares.putIfAbsent((r/3) + "," + (c/3), new HashSet<>());


                if (!rows.get(r).add(board[r][c]) ||
                    !cols.get(c).add(board[r][c]) ||
                    !squares.get((r/3) + "," + (c/3)).add(board[r][c]) ) {
                        return false;
                    }
            }
        }

        return true; 
        
    }
}