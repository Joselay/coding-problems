#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int n;
	cin>>n;
	int mx=0;
	ll ans =0;
	for(int i=0;i<n;i++){
		int x;
		cin>>x;
		mx=max(mx,x);
		ans+=mx-x;
	}
	cout<<ans;

	return 0;
}
