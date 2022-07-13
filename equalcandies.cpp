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
	ios_base::sync_with_stdio(false);
    cin.tie(0);
//===============================================
    
    int t,ans=0;
    cin>>t;
    vi primes;
    while(t--){
    	int n;
    	cin>>n;
    	for(int i = 0;i<n; i++){
    		int num;
    		cin>>num;
    		primes.pb(num);
		}
		sort(all(primes));
		for(int i = 1; i<primes.size(); i++)
			ans += (primes[i]-primes[0]);
		cout<<ans<<endl;
		ans = 0;
		primes.clear();
	}
	
	
	

	return 0;	
  
}