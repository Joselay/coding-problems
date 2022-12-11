#include <iostream>
#include <map>

using namespace std;

int main() {
    int n;
    cin >> n;

    map<int, int> num_indices;
    for (int i = 1; i <= n; i++) {
        int num;
        cin >> num;
        num_indices[num] = i;
    }

    for (int i = 1; i <= n; i++) {
        int index = num_indices[i];
        cout << num_indices[index] << endl;
    }

    return 0;
}
