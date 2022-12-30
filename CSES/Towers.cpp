#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n;

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin>>n;
	vector<int> v;
	for(int i=0;i<n;i++){
		int a;
		cin>>a;
		int p = upper_bound(v.begin(),v.end(),a)-v.begin();
		if(p<v.size())
			v[p]=a;
		else
			v.push_back(a);
	}
	cout<<v.size();

	return 0;
}
