#include<bits/stdc++.h>
using namespace std;

#define ll long long

const int mxN = 2e5;
int n,a[mxN],nl[mxN];

int main (){

	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a[i];
		nl[i]=i-1;
		while(~nl[i]&&a[nl[i]]>=a[i])
			nl[i]=nl[nl[i]];
		cout<<nl[i]+1<<" ";
	}

	return 0;
}
