class Solution:
    def calculate(self, s: str) -> int:
        stack = []
        num = 0
        sign = 1
        res = 0
        for ch in s:
            if ch.isdigit():
                num = num * 10 + int(ch)
            elif ch == '+':
                res += sign * num
                num = 0
                sign = 1
            elif ch == '-':
                res += sign * num
                num = 0
                sign = -1
            elif ch == '(':
                stack.append(res)
                stack.append(sign)
                sign = 1
                res = 0
            elif ch == ')':
                res += sign * num
                num = 0
                res *= stack.pop()
                res += stack.pop()
        if num:
            res += sign * num
        return res
