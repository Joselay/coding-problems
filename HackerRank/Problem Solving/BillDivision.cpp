#include <bits/stdc++.h>
using namespace std;

void solve(vector<int> bill, int k, int b) {

    int sum = 0;
    for (int i = 0; i < bill.size(); i++)
        if (i != k)
            sum += bill[i];


    int anna_should_have_paid = sum / 2;

    if (anna_should_have_paid == b)
        cout << "Bon Appetit" << endl;
    else
        cout << b - anna_should_have_paid << endl;
}

int main() {
    int n, k, b;
    cin >> n >> k;
    vector<int> bill(n);
    for (int i = 0; i < n; i++)
        cin >> bill[i];
    cin >> b;

    solve(bill, k, b);
    return 0;
}
