/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public NestedInteger deserialize(String s) {
        if (s.isEmpty()) return null;
        if (s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));

        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger res = null;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                if (res != null) stack.push(res);
                res = new NestedInteger();
                start = i + 1;
            } else if (c == ',' || c == ']') {
                if (i > start) {
                    res.add(new NestedInteger(Integer.valueOf(s.substring(start, i))));
                }
                start = i + 1;
                if (c == ']') {
                    if (!stack.isEmpty()) {
                        NestedInteger ni = stack.pop();
                        ni.add(res);
                        res = ni;
                    }
                }
            }
        }

        return res;
    }
}
