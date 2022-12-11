#include<bits/stdc++.h>

using namespace std;


int main(){
    string s,t;
    int k;
    cin>>s>>t>>k;
    int cl=0;
    while(cl<s.size() && cl<t.size()){
        if(s[cl]!=t[cl]) break;
        cl++;
    }
    if(s.size()-cl+t.size()-cl<=k&& (s.size()-cl+t.size()-cl)%2==k%2)
        cout<<"Yes"<<endl;
    else if(s.size()+t.size()<=k)
        cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
    return 0;
}
