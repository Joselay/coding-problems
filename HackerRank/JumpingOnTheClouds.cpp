#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;

    vector<int> c(n);
    for (int i = 0; i < n; i++)
        cin >> c[i];

    int energy = 100;
    int pos = 0;
    do
    {
        pos = (pos + k) % n;
        energy--;
        if (c[pos] == 1)
            energy -= 2;
    }
    while (pos != 0);

    cout << energy << endl;

    return 0;
}
