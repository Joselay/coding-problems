class Solution {
    HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (map.containsKey(s))
            return map.get(s);

        LinkedList<String> res = new LinkedList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> sublist = wordBreak(s.substring(word.length()), wordDict);
                for (String sub : sublist)
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }
        map.put(s, res);
        return res;
    }
}
