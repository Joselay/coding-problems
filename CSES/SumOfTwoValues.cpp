#include<bits/stdc++.h>
using namespace std;
#define ll long long

const int mxN = 2e5;
int n,x;

int main (){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin>>n>>x;
	map<int,int> mp;
	for(int i=0;i<n;i++){
		int a;
		cin>>a;
		if(mp.find(x-a)!=mp.end()){
			cout<<mp[x-a]+1<<" "<<i+1;
			return 0;
		}
		mp[a] = i;
	}
	cout<<"IMPOSSIBLE";

	return 0;
}
