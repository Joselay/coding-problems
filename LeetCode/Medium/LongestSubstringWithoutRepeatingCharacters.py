class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # Set to store characters in current longest substring
        chars = set()

        # Stores the longest substring
        longest = ""

        # Start and end indexes of the current substring
        start = 0
        end = 0

        while end < len(s):
            # If the current character is not in the set, add it and move the end index forward
            if s[end] not in chars:
                chars.add(s[end])
                end += 1
            else:
                # If the current character is in the set, remove the start character from the set
                # and move the start index forward
                chars.remove(s[start])
                start += 1

            # Update the longest substring if the current substring is longer
            if len(longest) < len(chars):
                longest = "".join(chars)

        return len(longest)
