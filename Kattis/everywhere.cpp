#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin>>t;
    unordered_set<string> s;
    while(t--){
        int n;
        cin>>n;
        for(int i=0;i<n;i++){
            string str;
            cin>>str;
            s.insert(str);
        }
        cout<<s.size()<<'\n';

        s.clear();
    }


    return 0;
}
