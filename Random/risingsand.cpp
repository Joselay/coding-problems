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

void solve(){
	ll n,k;
	cin>>n>>k;
	ll a[n];
	for(ll i = 0; i<n ;i++){
		cin>>a[i];
	}
	if(k > 1){
		ll res = 0;
		for(ll i=1;i<n-1; i++){
			res += (a[i] > a[i-1]+a[i+1]);
		}
		cout<<res<<endl;
	}
	else
		cout<<(n-1)/2<<endl;
}

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
    	solve();
    }
    

	return 0;	
  
}
