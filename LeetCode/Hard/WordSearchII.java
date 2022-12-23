class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode curr = root;
            for (char c : word.toCharArray()) {
                int i = c - 'a';
                if (curr.children[i] == null) {
                    curr.children[i] = new TrieNode();
                }
                curr = curr.children[i];
            }
            curr.word = word;
        }
        return root;
    }

    private void dfs(char[][] board, int i, int j, TrieNode curr, List<String> res) {
        char c = board[i][j];
        if (c == '#' || curr.children[c - 'a'] == null) return;
        curr = curr.children[c - 'a'];
        if (curr.word != null) {
            res.add(curr.word);
            curr.word = null;
        }

        board[i][j] = '#';
        if (i > 0) dfs(board, i - 1, j, curr, res);
        if (j > 0) dfs(board, i, j - 1, curr, res);
        if (i < board.length - 1) dfs(board, i + 1, j, curr, res);
        if (j < board[0].length - 1) dfs(board, i, j + 1, curr, res);
        board[i][j] = c;
    }
}
