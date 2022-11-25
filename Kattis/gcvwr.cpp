#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int g,t,n;
    cin>>g>>t>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    float res=0;
    int sum=0;
    for(int i=0;i<arr.size();i++)
        sum+=arr[i];
    res = 0.9*(g-t)-sum;
    cout<<res<<'\n';

    return 0;
}
