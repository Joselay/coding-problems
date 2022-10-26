#include<bits/stdc++.h>

#define int long long int
#define F first
#define S second
#define pb push_back

using namespace std;

int32_t main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	int n, nim_sum = 0, ans = 0;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	for (int i = 0; i < n; i++) {
		nim_sum ^= a[i];
	}
	for (int i = 0; i < n; i++) {
		if ((nim_sum ^ a[i]) < a[i]) ans++;
	}
	cout << ans;
	return 0;
}
