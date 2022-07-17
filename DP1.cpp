#include<bits/stdc++.h>

using namespace std;

int main()
{
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int n;
	cin >> n;
	int a[n];
	int dp[n];

	for (int i = 0; i < n; i++) {
		cin >> a[i];
		dp[i] = 1;
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {

			if (a[j] <= a[i]) {
				dp[i] = max(dp[i], dp[j] + 1);
			}

		}
	}

	int lis = 1;

	for (int i = 0; i < n; i++) {
		lis = max(lis, dp[i]);
	}

	cout << lis;



	return 0;
}