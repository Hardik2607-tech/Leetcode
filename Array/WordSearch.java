public class WordSearch {
  public boolean exist(char[][] board, String word) {
      int m = board.length;
      int n = board[0].length;
      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              if (dfs(board, word, i, j, 0)) {
                  return true;
              }
          }
      }
      return false;
  }

  private boolean dfs(char[][] board, String word, int i, int j, int index) {
      // If all characters matched, return true
      if (index == word.length()) {
          return true;
      }
      // Check boundaries and current character match
      if (i < 0 || i >= board.length ||
          j < 0 || j >= board[0].length ||
          board[i][j] != word.charAt(index)) {
          return false;
      }

      // Temporarily mark this cell as visited
      char temp = board[i][j];
      board[i][j] = '#';

      // Explore all four directions
      boolean found = dfs(board, word, i + 1, j, index + 1)
                   || dfs(board, word, i - 1, j, index + 1)
                   || dfs(board, word, i, j + 1, index + 1)
                   || dfs(board, word, i, j - 1, index + 1);

      // Backtrack: restore the original character
      board[i][j] = temp;

      return found;
  }

  public static void main(String[] args) {
      WordSearch ws = new WordSearch();
      char[][] board = {
          {'A','B','C','E'},
          {'S','F','C','S'},
          {'A','D','E','E'}
      };
      System.out.println(ws.exist(board, "ABCCED")); // true
      System.out.println(ws.exist(board, "SEE"));    // true
      System.out.println(ws.exist(board, "ABCB"));   // false
  }
}
