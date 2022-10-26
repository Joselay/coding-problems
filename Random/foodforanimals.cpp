#include<bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define pb push_back
#define endl '\n'
#define all(a) (a).begin(),(a).end()
#define rall(a) (a).rbegin(),(a).rend()
#define ll long long
#define ld long double

const long long int MAX_N = 1e5+5;
const ll MOD = 1e9+7;
const ll INF = 1e9;
const ld EPS = 1e-9;

int main (){

#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
	ios_base::sync_with_stdio(false);
    cin.tie(0);
//===============================================

    int t;
    cin>>t;
    while(t--){
    	int a,b,c,x,y;
    	cin>>a>>b>>c>>x>>y;
    	if(max(0,x-a)+max(0,y-b) <= c)
    		cout<<"YES\n";
    	else
    		cout<<"NO\n";
    }
    

	return 0;	
}
