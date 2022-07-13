#include<bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define vs vector<string>
#define pii pair<int, int>
#define si set<int>
#define pb push_back
#define read(a,b) cin>>a>>b
#define FOR(n) for(long long int i=0;i<=n;i++)
#define FORR(i,s,e) for(long long int i=s;i<=e;i++)
#define all(a) (a).begin(),(a).end()
#define rall(a) (a).rbegin(),(a).rend()
#define gcd(a,b) __gcd(a,b)
#define lcm(a,b) (a*(b/gcd(a,b)))
#define to_lower(a) transform(a.begin(), a.end(), a.begin(), ::tolower)
#define to_upper(a) transform(a.begin(), a.end(), a.begin(), ::toupper)
#define ar array
#define ll long long
#define lli long long int
#define ld long double
#define ulli unsigned long long int

const lli MAX_N = 1e5+5;
const ll MOD = 1e9+7;
const ll INF = 1e9;
const ld EPS = 1e-9;

lli n;
string str;
lli memo[3005][3005];

lli dp(lli i, lli s){
	if(i == n)
		return 1;
	lli &ans = memo[i][s];
	if(ans != -1)
		return ans;
	ans = 0;
	if(str[i-1] == '<'){
		lli g = (n-i-s);
		for(lli j =1; j<=g;j++){
			ans += dp(i+1, s+j-1);
		}
	}
	else{
		for(lli j =1;j<=s;j++)
			ans += dp(i+1,j-1);
	}
	return ans;
}

int32_t main (){

	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
//===============================================
    read(n,str);
    lli dp[n+1][n+1], ans=0;
   	
   	memset(dp,0, sizeof(dp));
   	dp[n][0] =1;

   	for(lli i = n-1; i>0; i--){
   		for(lli j =1; j<=n; j++){
   			dp[i+1][j] += dp[i+1][j-1];
   		}
   		for(lli s = 0; s<=n; s++){
   			lli g = (n-i-s);
   			if(g<0)
   				continue;
   			if(str[i-1] == '<'){
   				dp[i][s] = dp[i+1][s+g-1]-(s==0 ? 0 : dp[i+1][s-1]);
   			}
   			else{
   				dp[i][s] = dp[i+1][s-1];
   			}
   			dp[i][s] %= MOD;
   		}
   	}

   	for(lli i = 1;i<=n; i++){
   		ans += dp[1][i-1];
   		ans %= MOD;
   	}
   	ans += MOD;
   	ans %= MOD;
   	cout<<ans;

 
	return 0;	
  
}