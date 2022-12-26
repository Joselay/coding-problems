#include <bits/stdc++.h>

using namespace std;

int pageCount(int n, int p) {
 
  int from_front = p / 2;


  int from_back = n / 2 - p / 2;


  return min(from_front, from_back);
}

int main() {

  int n,p;
  cin>>n>>p;
  cout<<pageCount(n,p);

  return 0;
}
