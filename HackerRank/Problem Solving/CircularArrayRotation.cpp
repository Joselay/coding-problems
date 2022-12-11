#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, k, q;
    cin >> n >> k >> q;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[(i + k) % n];

    for (int i = 0; i < q; i++) {
        int m;
        cin >> m;
        cout << a[m] << endl;
    }

    return 0;
}
