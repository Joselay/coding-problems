#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;

    int liked = 0;
    int shared = 5;

    for (int i = 0; i < n; i++)
    {
        liked += (shared / 2);
        shared = (shared / 2) * 3;
    }

    cout << liked << endl;

    return 0;
}
