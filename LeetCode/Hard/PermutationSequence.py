from math import factorial

class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        numbers = [str(i) for i in range(1, n+1)]

        permutation = ""

        while numbers:
            fact = factorial(len(numbers)-1)

            index = (k-1) // fact

            permutation += numbers[index]

            numbers.pop(index)

            k -= index * fact

        return permutation
