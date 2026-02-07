class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {

        unordered_map<int, unordered_set<char>> rows;
        unordered_map<int, unordered_set<char>> cols;
        map<pair<int, int>, unordered_set<char>> squares;

        for (int r=0; r<board.size(); r++){
            for (int c=0; c<board.size(); c++){
                if (board[r][c] == '.'){
                    continue;}

                if (rows[r].count(board[r][c]) != 0 ||
                    cols[c].count(board[r][c]) != 0 ||
                    squares[{r/3, c/3}].count(board[r][c]) != 0){
                        return false;
                }

                rows[r].insert(board[r][c]);
                cols[c].insert(board[r][c]);
                squares[{r/3, c/3}].insert(board[r][c]);

            }
        }

        return true;
        
    }
};