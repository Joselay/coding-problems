#include<bits/stdc++.h>

using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> c(n, INT_MAX/2);
    for(int i = 0;i < n;i++){
       int x;
        cin >> x;
        if (x == 1) continue;
        if (i == 0) c[i] = 0;
        else if (i == 1) c[i] = 1 + c[0];
        else c[i] = min(c[i-1], c[i-2]) + 1;
    }
    cout << c.back() << endl;
    return 0;
}
