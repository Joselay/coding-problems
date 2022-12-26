#include <iostream>

using namespace std;

int main() {
  int t;
  cin >> t;

  for (int i = 0; i < t; i++) {
    int n, m, s;
    cin >> n >> m >> s;

    int prisoner = (m + s - 2) % n + 1;

    cout << prisoner << endl;
  }

  return 0;
}
