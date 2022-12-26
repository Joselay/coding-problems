#include <bits/stdc++.h>
using namespace std;

string solve(int year) {
    if (year == 1918)
        return "26.09.1918";
    else if (year < 1918)
        return (year % 4 == 0) ? "12.09." + to_string(year) : "13.09." + to_string(year);
    else
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + to_string(year) : "13.09." + to_string(year);
}

int main() {
    int year;
    cin >> year;
    cout << solve(year) << endl;
    return 0;
}
