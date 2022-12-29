#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int n;
	cin>>n;
	for(int i=1;i<=n;i++){
		ll a1 = i*i, a2=a1*(a1-1)/2;
		if(i>2)
			a2-=4*(i-1)*(i-2);
		cout<<a2<<"\n";
	}

	return 0;
}
