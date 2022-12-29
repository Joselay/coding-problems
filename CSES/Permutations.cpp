#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main () {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int n;
	cin>>n;
	if(n==1){
		cout<<1;
		return 0;
	}
	if(n==2||n==3){
		cout<<"NO SOLUTION";
		return 0;
	}
	if(n%2==0){
		for(int i=2;i<=n;i+=2)
			cout<<i<<" ";
		for(int i=1;i<n;i+=2)
			cout<<i<<" ";
	}
	else{
		for(int i=n-1;i>0;i-=2)
			cout<<i<<" ";
		for(int i=n;i>0;i-=2)
			cout<<i<<" ";
	}

	return 0;
}
