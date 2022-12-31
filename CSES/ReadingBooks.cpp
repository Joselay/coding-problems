#include<bits/stdc++.h>
using namespace std;

#define ll long long

const int mxN = 2e5;
int n,a[mxN];

int main (){

	cin>>n;
	ll s=0;
	for(int i=0;i<n;i++)
		cin>>a[i],s+=a[i];
	sort(a,a+n);
	cout<<max(s,2ll*a[n-1]);

	return 0;
}
