#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;

    vector<int> sticks(n);
    for (int i = 0; i < n; ++i)
        cin >> sticks[i];

    sort(sticks.begin(), sticks.end());

    while (!sticks.empty())
    {
        cout << sticks.size() << endl;

        int min_stick = sticks[0];
        for (int i = 0; i < sticks.size(); ++i)
            sticks[i] -= min_stick;

        auto new_end = remove_if(sticks.begin(), sticks.end(), [](int x) { return x <= 0; });
        sticks.erase(new_end, sticks.end());
    }

    return 0;
}
