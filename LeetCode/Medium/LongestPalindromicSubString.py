class Solution:
    def longestPalindrome(self, s: str) -> str:
        # Base cases
        if len(s) < 2 or s == s[::-1]:
            return s

        n = len(s)
        longest_palindrome = s[0]

        for i in range(n):
            # Odd length palindromes
            palindrome = self.expand_around_center(s, i, i)
            if len(palindrome) > len(longest_palindrome):
                longest_palindrome = palindrome

            # Even length palindromes
            palindrome = self.expand_around_center(s, i, i+1)
            if len(palindrome) > len(longest_palindrome):
                longest_palindrome = palindrome

        return longest_palindrome

    def expand_around_center(self, s: str, left: int, right: int) -> str:
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1

        return s[left+1:right]
