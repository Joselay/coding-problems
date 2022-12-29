#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int t;
	cin>>t;
	while(t--){
		ll y,x;
		cin>>y>>x;
		ll z = max(y,x);
		ll z2 = (z-1)*(z-1), ans;
		if(z%2){
			if(y==z)
				ans=z2+x;
			else
				ans = z2+2*z-y;
		}
		else{
			if(x==z)
				ans = z2+y;
			else
				ans = z2+2*z-x;
		}
		cout<<ans<<"\n";
	}

	return 0;
}
