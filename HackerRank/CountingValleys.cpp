#include <bits/stdc++.h>

using namespace std;

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int elevation = 0;
    int numValleys = 0;
    bool inValley = false;
    int n;
    string path;
    cin >> n >> path;
    for (char c: path) {
        if (c == 'U')
            elevation++;
        else if (c == 'D')
            elevation--;

        if (elevation < 0 && !inValley) {
            numValleys++;
            inValley = true;
        } else if (elevation >= 0)
            inValley = false;
    }

    cout << numValleys << endl;

    return 0;
}
