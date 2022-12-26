#include <bits/stdc++.h>

using namespace std;

// Define some global variables
const int MAXN = 100001;
const int MOD = 1000000007;
int fact[MAXN], ifact[MAXN];

// Define a modular exponentiation function
int modpow(int base, int exp) {
    int result = 1;
    while (exp > 0) {
        if (exp & 1) result = (long long)result * base % MOD;
        base = (long long)base * base % MOD;
        exp >>= 1;
    }
    return result;
}

// Define a function to compute the factorials
void factorials(int n) {
    fact[0] = 1;
    for (int i = 1; i <= n; i++) fact[i] = (long long)fact[i - 1] * i % MOD;
    ifact[n] = modpow(fact[n], MOD - 2);
    for (int i = n; i >= 1; i--) ifact[i - 1] = (long long)ifact[i] * i % MOD;
}

// Define the main function
int main() {
    // Read the input
    int t, n, m;
    scanf("%d", &t);

    // Precompute the factorials
    factorials(100000);

    // Solve each test case
    while (t--) {
        scanf("%d%d", &n, &m);
        printf("%lld\n", (long long)fact[n + m - 1] * ifact[n] % MOD * ifact[m - 1] % MOD);
    }

    // Return 0 to indicate successful completion of the program
    return 0;
}
