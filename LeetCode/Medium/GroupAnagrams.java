import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> groups = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      List<String> group = groups.getOrDefault(key, new ArrayList<>());
      group.add(str);
      groups.put(key, group);
    }
    return new ArrayList<>(groups.values());
  }
}
