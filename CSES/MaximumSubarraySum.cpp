#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n;

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin>>n;
	ll ans = -1e18,msf=-1e18;
	for(int i=0;i<n;i++){
		int a;
		cin>>a;
		msf=max(0ll+a,msf+a);
		ans = max(ans,msf);
	}
	cout<<ans;

	return 0;
}
