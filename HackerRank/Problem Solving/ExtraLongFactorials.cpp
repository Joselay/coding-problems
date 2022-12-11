#include <bits/stdc++.h>

using namespace std;

const int MAX_DIGITS = 500;

int result[MAX_DIGITS];

void factorial(int n)
{
    memset(result, 0, sizeof(result));
    result[0] = 1;
    for (int i = 1; i <= n; i++)
    {
        int carry = 0;
        for (int j = 0; j < MAX_DIGITS; j++)
        {
            int product = result[j] * i + carry;
            result[j] = product % 10;
            carry = product / 10;
        }
    }
}

void printResult()
{
    int i = MAX_DIGITS - 1;
    while (i >= 0 && result[i] == 0)
        i--;
    if (i < 0)
    {
        cout << 1 << endl;
        return;
    }

    while (i >= 0)
        cout << result[i--];
    cout << endl;
}

int main()
{
    int n;
    cin >> n;
    factorial(n);
    printResult();

    return 0;
}
