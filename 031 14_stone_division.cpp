#include<bits/stdc++.h>

#define int long long int
#define F first
#define S second
#define pb push_back

using namespace std;

const int N = 10;

int s[N];
int n, m;
map<int, bool> mp;

bool give_WL(int n) {
	if (mp.count(n)) return mp[n];
	for (int i = 0; i < m; i++) {
		if (n % s[i] == 0 && s[i] % 2 == 0) return mp[n] = true;
	}
	for (int i = 0; i < m; i++) {
		if (n % s[i] == 0 && give_WL(n / s[i]) == false) return mp[n] = true;
	}
	return mp[n] = false;
}

int32_t main() {

// #ifndef ONLINE_JUDGE
//     freopen("input.txt", "r", stdin);
//     freopen("output.txt", "w", stdout);
// #endif

	cin >> n >> m;

	for (int i = 0; i < m; i++) {
		cin >> s[i];
	}

	int win = give_WL(n);

	if (win) cout << "First";
	else cout << "Second";

	return 0;
}
