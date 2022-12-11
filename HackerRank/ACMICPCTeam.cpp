#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;

    vector<string> topics(n);
    for (int i = 0; i < n; i++)
    {
        cin >> topics[i];
    }

    int max_topics = 0;
    int teams = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int topics_known = 0;
            for (int k = 0; k < m; k++)
            {
                if (topics[i][k] == '1' || topics[j][k] == '1')
                {
                    topics_known++;
                }
            }

            if (topics_known > max_topics)
            {
                max_topics = topics_known;
                teams = 1;
            }
            else if (topics_known == max_topics)
            {
                teams++;
            }
        }
    }

    cout << max_topics << endl;
    cout << teams << endl;

    return 0;
}
