#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define ld long double
#define vt vector
#define vect(a,b) ((b)-(a))
#define pb push_back
#define EACH(x, a) for(auto& x: a)
#define all(a) (a).begin(),(a).end()
#define rall(a) (a).rbegin(),(a).rend()
#define sz(x) (int)(x).size()
#define FOR(n) for(int i = 0; i < (n); ++i)
#define REP(i,a,b) for (int i = (a); i<(b); ++i)
#define ulli unsigned long long int
#define sq(a) (a)*(a)
#define F first
#define S second
#define mp make_pair
#define F0(x) __builtin_clz(x)
#define L0(x) __builtin_ctz(x)
#define CB(x) __builtin_popcount(x)
#define ALL all_of
#define NONE none_of
#define ANY any_of
#define COPY(CopyFrom,size,PasteToNewArr) copy_n(CopyFrom,size,PasteToNewArr)
#define to_upper(su) transform(su.begin(), su.end(), su.begin(), ::toupper);
#define to_lower(sl) transform(sl.begin(), sl.end(), sl.begin(), ::tolower);
template<class T> bool umin(T& a, const T& b){return b<a?a=b, 1:0;}
template<class T> bool umax(T& a, const T& b){return a<b?a=b, 1:0;}
bool isPrime(ll a) {if (a==1)return 0;for (int i=2;i<=round(sqrt(a));++i)if(a%i==0)return 0;return 1;}
int CD(ll n) {return floor(log10(n) + 1);}
bool isPow2 (ll x){return x && (!(x&(x-1)));}

typedef pair<int,int> pii;
const long long int MAX_N = 1e5+5;
const ll MOD = 1e9+7;
const ll INF = 1e9;
const ld EPS = 1e-9;
const double PI=acos(-1.0);

int gridWays(int i, int j, int m, int n){
	if(i==m-1 and j==n-1)
		return 1;
	if(i>=m or j>=n)
		return 0;
	return gridWays(i,j+1,m,n)+gridWays(i+1,j,m,n);
}

int main (){
	ios::sync_with_stdio(0);
	cin.tie(0);

	int m,n;
	cin>>m>>n;
	cout<<gridWays(0,0,m,n);


	return 0;	
}
