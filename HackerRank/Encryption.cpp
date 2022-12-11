#include<bits/stdc++.h>

using namespace std;

string encrypt(string s)
{
    s.erase(remove(s.begin(), s.end(), ' '), s.end());
    int rows = floor(sqrt(s.length()));
    int cols = ceil(sqrt(s.length()));
    rows += (rows * cols < s.length());

    string result = "";
    for (int i = 0; i < cols; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            int index = i + j * cols;
            if (index < s.length())
                result += s[index];
        }
        result += " ";
    }

    return result;
}

int main()
{
    string s;
    getline(cin, s);

    string result = encrypt(s);
    cout << result << endl;

    return 0;
}
