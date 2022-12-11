#include<bits/stdc++.h>
using namespace std;
int main (){
    cin.tie(0);
    ios::sync_with_stdio(0);
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int height=1;
        for(int i=1;i<=n;i++)
            height = (i&1?height*=2:height+1);
        cout<<height<<'\n';
    }
    
    return 0;
}
