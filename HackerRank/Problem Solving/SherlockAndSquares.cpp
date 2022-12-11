#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        int a, b;
        cin >> a >> b;
        int sqrt_a = sqrt(a);
        int sqrt_b = sqrt(b);
        if (sqrt_a * sqrt_a != a)
            sqrt_a++;

        int count = sqrt_b - sqrt_a + 1;
        cout << count << endl;
    }

    return 0;
}
