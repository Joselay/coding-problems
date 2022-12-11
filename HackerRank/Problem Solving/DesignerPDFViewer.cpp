#include <iostream>
#include <vector>

using namespace std;

int main() {
  vector<int> heights(26);

  for (int i = 0; i < 26; i++)
    cin >> heights[i];

  string word;
  cin >> word;

  int tallest = 0;
  for (char c : word)
    tallest = max(tallest, heights[c - 'a']);

  cout << word.length() * tallest << endl;

  return 0;
}
