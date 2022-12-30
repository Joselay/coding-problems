#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n,m,k,a[mxN],b[mxN];

int main (){
	
	cin>>n>>m>>k;
	for(int i=0;i<n;i++)
		cin>>a[i];
	for(int i=0;i<m;i++)
		cin>>b[i];
	sort(a,a+n);
	sort(b,b+m);
	int ans =0;
	for(int i=0,j=0;i<n;++i){
		while(j<m&&b[j]<a[i]-k)
			++j;
		if(j<m&&b[j]<=a[i]+k)
			++ans,++j;
	}
	cout<<ans;

	return 0;
}
