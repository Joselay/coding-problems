#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int t;
	cin>>t;
	while(t--){
		int a,b;
		cin>>a>>b;
		cout<<((a+b)%3==0 && min(a,b)*2>=max(a,b) ? "YES\n":"NO\n");
	}

	return 0;
}
