#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n,p[mxN];

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin>>n;
	for(int i=0;i<n;i++)
		cin>>p[i];
	sort(p,p+n);
	ll x = p[n/2];
	ll ans =0;
	for(int i=0;i<n;i++)
		ans+=abs(p[i]-x);
	cout<<ans;

	return 0;
}
