import java.util.Map;
import java.util.TreeMap;

public class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word.toCharArray(), 0, root);
    }

    private boolean dfs(char[] word, int idx, TrieNode node) {
        if (idx == word.length) {
            return node.isWord;
        }
        if (word[idx] == '.') {
            for (TrieNode child : node.children) {
                if (child != null && dfs(word, idx + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = word[idx] - 'a';
            TrieNode child = node.children[index];
            return child != null && dfs(word, idx + 1, child);
        }
    }

    private static class TrieNode {
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
    }
}
