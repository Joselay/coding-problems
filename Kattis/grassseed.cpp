#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    double n;
    cin>>n;
    int t;
    cin>>t;
    double s=0;
    while(t--){
        double a,b;
        cin>>a>>b;
        s+=(a*b*n);
    }
    printf("%.6f",s);

    return 0;
}
