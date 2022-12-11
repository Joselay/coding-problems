#include <bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n>>k;
        int c=0;
        vector<int> arr(n);
        for(int &i : arr)
            cin>>i;
        for(int i=0;i<n;i++)
            c+=(arr[i]<=0);
        cout<<(c>=k?"NO\n":"YES\n");
    }

    return 0;
}
