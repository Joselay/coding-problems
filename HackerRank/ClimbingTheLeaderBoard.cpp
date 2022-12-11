#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n;
    vector<int> scores(n);
    for (int i = 0; i < n; i++)
        cin >> scores[i];
    cin >> m;
    vector<int> alice(m);
    for (int i = 0; i < m; i++)
        cin >> alice[i];

    vector<int> unique_scores;
    unique_scores.push_back(scores[0]);
    for (int i = 1; i < n; i++)
        if (scores[i] != scores[i-1])
            unique_scores.push_back(scores[i]);

    int j = unique_scores.size() - 1;
    for (int i = 0; i < m; i++) {
        while (j >= 0 && alice[i] >= unique_scores[j])
            j--;
        cout << j + 2 << endl;
    }

    return 0;
}
