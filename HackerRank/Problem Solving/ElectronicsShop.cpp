#include <bits/stdc++.h>

using namespace std;

int main() {
    int s, n, m;
    cin >> s >> n >> m;

    vector<int> keyboards(n), drives(m);
    for (int i = 0; i < n; i++) cin >> keyboards[i];
    for (int i = 0; i < m; i++) cin >> drives[i];

    sort(keyboards.begin(), keyboards.end());
    sort(drives.begin(), drives.end());

    int max_price = -1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int price = keyboards[i] + drives[j];
            if (price > s) break;
            if (price > max_price) max_price = price;
        }
    }

    cout << max_price << endl;

    return 0;
}
