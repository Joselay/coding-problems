#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    string str;
    cin>>str;
    string ans="";
    string res = str.substr(1,str.length()-2);
    for(int i=1;i<str.length()-1;i++)
        ans+="e";
    res+=ans;
    if(str[0] =='h' &&str[1] =='e' && str[str.length()-1]=='y')
        cout<<"h"<<res<<"y";
    else
        cout<<"Alligator!"<<'\n';

    return 0;
}
