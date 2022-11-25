#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    string str;
    cin>>str;
    string res="";
    vector<int> arr;
    int c=0;
    for(int i=1;i<str.length();i++){
        c++;
        if(str[i]=='-')
            arr.push_back(c+1);
    }
    res+=str[0];
    
    for(int i=0;i<arr.size();i++)
        res+=str[arr[i]];
    cout<<res;

    return 0;
}
