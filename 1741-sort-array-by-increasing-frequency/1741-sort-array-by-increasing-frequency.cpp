#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        unordered_map<int, int> freq;

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        // Custom comparator for priority queue (min-heap by freq, max-heap by value)
        auto cmp = [&](pair<int,int> &a, pair<int,int> &b) {
            if (a.second == b.second) 
                return a.first < b.first; // higher value first if frequency equal
            return a.second > b.second; // lower frequency first
        };

        priority_queue<pair<int,int>, vector<pair<int,int>>, decltype(cmp)> pq(cmp);

        // Push all elements (num, frequency)
        for (auto &p : freq) {
            pq.push({p.first, p.second});
        }

        vector<int> ans;
        while (!pq.empty()) {
            auto [num, count] = pq.top();
            pq.pop();
            for (int i = 0; i < count; i++) ans.push_back(num);
        }

        return ans;
    }
};
