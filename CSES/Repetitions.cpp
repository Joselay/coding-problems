#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	string s;
	cin>>s;
	int ans=1,c=0;
	char l='A';
	for(char d : s){
		if(d==l){
			++c;
			ans = max(c,ans);
		}
		else{
			l=d;
			c=1;
		}
	}
	cout<<ans;

	return 0;
}
