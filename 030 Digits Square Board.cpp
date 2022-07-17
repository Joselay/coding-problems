#include<bits/stdc++.h>
using namespace std;

const int N = 30;

int a[N][N];
int memo[N][N][N][N];
int memo1[N][N][N][N];

bool all_prime(int x1, int y1, int x2, int y2) {
	if (memo1[x1][y1][x2][y2] != -1) return memo1[x1][y1][x2][y2];
	for (int i = x1; i <= x2; i++) {
		for (int j = y1; j <= y2; j++) {
			if (a[i][j] == 1 || a[i][j] == 4 || a[i][j] == 6
			        || a[i][j] == 8 || a[i][j] == 9) return memo1[x1][y1][x2][y2] = false;
		}
	}
	return memo1[x1][y1][x2][y2] = true;
}

int grundy(int x1, int y1, int x2, int y2) {
	if (x1 == x2 && y1 == y2) return 0;
	if (all_prime(x1, y1, x2, y2)) return 0;
	int &ans = memo[x1][y1][x2][y2];
	if (ans != -1) return ans;

	set<int> St;
	// horizontally
	for (int i = x1; i < x2; i++) {
		int g1 = grundy(x1, y1, i, y2);
		int g2 = grundy(i + 1, y1, x2, y2);
		int g = g1 ^ g2;
		St.insert(g);
	}

	// vertical cut
	for (int j = y1; j < y2; j++) {
		int g1 = grundy(x1, y1, x2, j);
		int g2 = grundy(x1, j + 1, x2, y2);
		int g = g1 ^ g2;
		St.insert(g);
	}

	int mex = 0;
	for (int i = 0;; i++) {
		if (St.find(i) == St.end()) {
			mex = i;
			break;
		}
	}
	return ans = mex;
}

int main()
{
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < n; l++) {
						memo[i][j][k][l] = memo1[i][j][k][l] = -1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				cin >> a[i][j];
			}
		}
		int g = grundy(0, 0, n - 1, n - 1);
		if (g) {
			cout << "First\n";
		}
		else {
			cout << "Second\n";
		}
	}

	return 0;
}