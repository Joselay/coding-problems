#include <bits/stdc++.h>

using namespace std;

const int MAXN = 8;
const int SIZE = 3;
const int INF = 0x3f3f3f3f;

int a[SIZE][SIZE];
int magic[MAXN][SIZE][SIZE] = 
{
    {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
    {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
    {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, 
    {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
    {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
    {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
};

int ans = INF;

int calc(int s)
{
    int res = 0;
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            res += abs(a[i][j] - magic[s][i][j]);
    return res;
}

int main()
{
  cin.tie(0);
	ios::sync_with_stdio(0);
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            cin >> a[i][j];

    for (int i = 0; i < MAXN; i++)
        ans = min(ans, calc(i));

    cout << ans << endl;

    return 0;
}
