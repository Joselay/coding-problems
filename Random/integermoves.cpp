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
    
    int t;
    cin>>t;
    int ans = 0;
    while(t--){
    	int x,y;
    	cin>>x>>y;
    	if(sqrt(pow((0-x),2)+pow((0-y),2)) == int(sqrt(pow((0-x),2)+pow((0-y),2))) && x!=y){
    		cout<<1<<endl;
		}
		else if(x ==0 && y == 0)
			cout<<0<<endl;
		else
			cout<<2<<endl;	
	}
	
	

	return 0;	
  
}
