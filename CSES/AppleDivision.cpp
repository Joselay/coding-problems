#include <bits/stdc++.h>
using namespace std;

#define ll long long
int n,p[20];
int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin>>n;
	ll s=0,ans=0;
	for(int i=0;i<n;i++)
		cin>>p[i],s+=p[i];
	for(int i=0;i<1<<n;i++){
		ll cs =0;
		for(int j=0;j<n;j++)
			if(i>>j&1)
				cs+=p[j];
		if(cs<=s/2)
			ans=max(ans,cs);
	}
	cout<<s-2*ans;

	return 0;
}
