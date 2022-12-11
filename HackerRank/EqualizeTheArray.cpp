#include <bits/stdc++.h>
using namespace std;


int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int n;
    cin>>n;
    vector<int> arr(n);
    int res=0;
    unordered_set<int> s;
    for(int &i : arr){
        cin>>i;
        s.insert(i);
    }
    for(int i : s)
        res = max(res,int(count(arr.begin(),arr.end(),i)));
    cout<<n-res<<"\n";    

    return 0;
}
