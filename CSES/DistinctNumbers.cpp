#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int t;
	cin>>t;
	unordered_set<int> s;
	while(t--){
		int n;
		cin>>n;
		s.insert(n);
	}
	cout<<s.size();

	return 0;
}
