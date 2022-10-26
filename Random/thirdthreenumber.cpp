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

void solve(int n){
	if(n&1)
		cout<<-1<<endl;
	else{
		n/=2;
		int b,c;
		b = 1;
		c = n^b;
		cout<<b<<" "<<b<<" "<<c<<endl;
	}
}

int main (){
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
//===============================================
    
    int t;
    cin>>t;
    while(t--){
    	int n;
    	cin>>n;
    	solve(n);
	}

	return 0;	
  
}
