#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while (t-- > 0) {
        unsigned long long b,w,x,y,z;
        cin >> b >> w >> x >> y >> z;
        
        if (x+z < y)
            cout << x*b + (x+z)*w <<endl;
        else if (y+z < x)
            cout << (y+z)*b + y*w <<endl;
        else
            cout << x*b + y*w <<endl;
    }
    return 0;
}
