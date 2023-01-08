import java.util.*;

class Solution {
  public int minMutation(String start, String end, String[] bank) {
    Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
    if (!bankSet.contains(end)) {
      return -1;
    }
    char[] charSet = new char[]{'A', 'C', 'G', 'T'};
    int level = 0;
    Set<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.offer(start);
    visited.add(start);
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size-- > 0) {
        String curr = queue.poll();
        if (curr.equals(end)) {
          return level;
        }
        char[] currArray = curr.toCharArray();
        for (int i = 0; i < currArray.length; i++) {
          char old = currArray[i];
          for (char c : charSet) {
            currArray[i] = c;
            String next = new String(currArray);
            if (!visited.contains(next) && bankSet.contains(next)) {
              visited.add(next);
              queue.offer(next);
            }
          }
          currArray[i] = old;
        }
      }
      level++;
    }
    return -1;
  }
}
