#include <bits/stdc++.h>

using namespace std;

int main() {
    int q;
    cin >> q;
    while (q--) {
        int n;
        cin >> n;
        vector<long long> rows(n), cols(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x;
                cin >> x;
                rows[i] += x;
                cols[j] += x;
            }
        }
        sort(rows.begin(), rows.end());
        sort(cols.begin(), cols.end());
        bool possible = true;
        for (int i = 0; i < n; i++) {
            if (rows[i] != cols[i]) {
                possible = false;
                break;
            }
        }
        cout << (possible ? "Possible" : "Impossible") << endl;
    }
    return 0;
}
