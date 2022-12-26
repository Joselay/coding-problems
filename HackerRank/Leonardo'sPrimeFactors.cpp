#include <iostream>
using namespace std;
#define ll long long int

int main()
{
    ll prime[] = {2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47};
    int test;
    cin>>test;
    while(test--)
    {
        ll N, product = 1, ans=0;
        cin>>N;
        for(int i=0; i<15; i++)
        {
            product = product*prime[i];
            if(product <= N)
                ans++;
        }
        cout<<ans<<endl;
    }
    return 0;
}
