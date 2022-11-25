#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    string str;
    cin>>str;
    bool isTrue = false;
    for(int i=0;i<str.length()-1;i++)
        if(str[i]=='s' && str[i+1]=='s')
            isTrue = true;
    cout<<(isTrue ? "hiss":"no hiss");

    return 0;
}
