#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN=2e5;
int n,x,a[mxN];

int main (){
	
	cin>>n>>x;
	for(int i=0;i<n;i++)
		cin>>a[i];
	sort(a,a+n);
	int ans =0;
	for(int i=0,j=n-1;i<j;){
		while(i<j&&a[i]+a[j]>x)
			--j;
		if(i>=j)
			break;
		++ans;
		++i,--j;
	}
	cout<<n-ans;

	return 0;
}
