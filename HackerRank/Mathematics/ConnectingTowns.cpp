#include <iostream>
using namespace std;

int main() {
  int t;
  cin>>t;
  while(t--){
      int total = 1;
    int nt, np;
    cin >> nt;
    for (int ti = 0; ti < nt - 1; ti++) {
      cin >> np;
      total = (total * np) % 1234567;
    }
    cout << total << endl;
  }

    


  return 0;
}
