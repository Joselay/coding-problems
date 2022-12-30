#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n;

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin>>n;
	set<array<int,2>>s;
	for(int i=0;i<n;i++){
		int a,b;
		cin>>a>>b;
		s.insert({2*a,1});
		s.insert({2*b+1,-1});
	}
	int ans =0,c=0;
	for(auto a : s){
		c+=a[1];
		ans = max(ans,c);
	}
	cout<<ans;

	return 0;
}
