#include<bits/stdc++.h>
using namespace std;

#define ll long long

const int mxN = 2e5;
int n;
array<int,2> a[mxN];

int main (){

	cin>>n;
	for(int i=0;i<n;i++)
		cin>>a[i][0]>>a[i][1];
	sort(a,a+n);
	ll t=0,ans=0;
	for(int i=0;i<n;i++){
		t+=a[i][0];
		ans+=a[i][1]-t;
	}
	cout<<ans;

	return 0;
}
