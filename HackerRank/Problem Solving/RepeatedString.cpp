#include <iostream>
#include <string>

using namespace std;

int main() {
  string s;
  long long n;
  cin >> s >> n;
  int count = 0;
  for (char ch : s)
    if (ch == 'a')
      ++count;

  long long repeatedCount = count * (n / s.length());

  for (int i = 0; i < n % s.length(); ++i)
    if (s[i] == 'a')
      ++repeatedCount;
  cout << repeatedCount << endl;

  return 0;
}
