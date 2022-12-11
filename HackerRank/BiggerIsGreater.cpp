#include<bits/stdc++.h>

using namespace std;

string next_string(const string& str) {
  int pos = -1;
  for (int i = 0; i < str.size() - 1; i++) {
    if (str[i] < str[i + 1]) {
      pos = i;
    }
  }
  if (pos == -1) {
    return "";
  }
  char smallest = 'z';
  int smallest_pos = -1;
  for (int i = pos + 1; i < str.size(); i++) {
    if (str[i] > str[pos] && str[i] <= smallest) {
      smallest = str[i];
      smallest_pos = i;
    }
  }
  string result = str;
  swap(result[pos], result[smallest_pos]);
  sort(result.begin() + pos + 1, result.end());

  return result;
}

int main() {
  int t;
  cin >> t;

  while (t--) {
    string str;
    cin >> str;

    string result = next_string(str);
    if (result.empty()) {
      cout << "no answer" << endl;
    } else {
      cout << result << endl;
    }
  }

  return 0;
}
