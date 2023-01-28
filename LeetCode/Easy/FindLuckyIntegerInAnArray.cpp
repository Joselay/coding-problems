class Solution {
public:
    int findLucky(vector<int>& arr) {
        map<int,int> m;
        for(int i=0;i<arr.size();i++)
            m[arr[i]]++;
        vector<pair<int,int>> vp(m.size());
        int c=0;
        for(auto i : m)
            vp[c++] = {i.first, i.second};
        sort(vp.begin(),vp.end(),[](pair<int,int>a,pair<int,int>b){return a.first>b.first;});
        for(auto &[a,b] : vp)
            if(a==b)
                return a;
        return -1;
    }
};
