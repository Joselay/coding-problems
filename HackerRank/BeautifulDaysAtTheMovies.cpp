#include <bits/stdc++.h>
using namespace std;

int main() {
	cin.tie(0);
	ios::sync_with_stdio(0);

	int i,j,k;
	cin>>i>>j>>k;
	int c=0;
	for(i;i<=j;i++){
		string rev = to_string(i);
		reverse(rev.begin(),rev.end());
		int R = stoi(rev);
		c+=(abs(i-R)%k==0);
	}
	cout<<c<<'\n';

	return 0;
}
