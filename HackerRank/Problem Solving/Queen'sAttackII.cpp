#include <bits/stdc++.h>

using namespace std;

const int N = 1e3 + 10;

int n, k;

int x, y;

set<pair<int, int>> obstacles;

int main() {
    cin >> n >> k;
    cin >> x >> y;
    while (k--) {
        int sx, sy;
        cin >> sx >> sy;
        obstacles.insert({sx, sy});
    }
    int ans = 0;
    for (int i = x + 1; i <= n; i++) {
        if (obstacles.count({i, y})) break;
        ans++;
    }
    for (int i = x - 1; i >= 1; i--) {
        if (obstacles.count({i, y})) break;
        ans++;
    }
    for (int i = y + 1; i <= n; i++) {
        if (obstacles.count({x, i})) break;
        ans++;
    }
    for (int i = y - 1; i >= 1; i--) {
        if (obstacles.count({x, i})) break;
        ans++;
    }
    for (int i = x + 1, j = y + 1; i <= n && j <= n; i++, j++) {
        if (obstacles.count({i, j})) break;
        ans++;
    }
    for (int i = x - 1, j = y + 1; i >= 1 && j <= n; i--, j++) {
        if (obstacles.count({i, j})) break;
        ans++;
    }
    for (int i = x + 1, j = y - 1; i <= n && j >= 1; i++, j--) {
        if (obstacles.count({i, j})) break;
        ans++;
    }
    for (int i = x - 1, j = y - 1; i >= 1 && j >= 1; i--, j--) {
        if (obstacles.count({i, j})) break;
        ans++;
    }
    cout << ans << endl;
    return 0;
}
