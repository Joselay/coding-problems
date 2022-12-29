#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	ll n,s=1;
	cin>>n;
	for(int i=0;i<n;i++)
		s=2*s%((int)1e9+7);
	cout<<s;

	return 0;
}
