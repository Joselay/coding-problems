#include <bits/stdc++.h>
using namespace std;

int main() {
	cin.tie(0);
	ios::sync_with_stdio(0);

	int n;
	cin>>n;
	int res=0;
	unordered_map<int,int> m;
	vector<int> arr(n);
	for(int i=0;i<n;i++)
		cin>>arr[i];
	for(int i=0;i<n;i++)
		m[arr[i]]++;
	for(const auto &[a,b] : m)
		res+=b/2;
	cout<<res;
	return 0;
}
