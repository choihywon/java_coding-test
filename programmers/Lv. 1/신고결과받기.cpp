#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> id_list, vector<string> report, int k) {
    int n = id_list.size();
    vector<int> reportCount(n, 0);
    unordered_map<string, unordered_set<string>> reports;


    for (const string& r : report) {
        size_t spaceIndex = r.find(' ');
        string reporter = r.substr(0, spaceIndex);
        string reported = r.substr(spaceIndex + 1);
        
        reports[reporter].insert(reported); 
    }


    for (const auto& entry : reports) {
        const string& reporter = entry.first;
        const auto& reportedUsers = entry.second;

        for (const string& reported : reportedUsers) {
            auto it = find(id_list.begin(), id_list.end(), reported);
            if (it != id_list.end()) {
                int index = distance(id_list.begin(), it);
                reportCount[index]++;
            }
        }
    }


    vector<int> answer(n, 0);

    for (int i = 0; i < n; i++) {
        if (reportCount[i] >= k) {
            for (const auto& entry : reports) {
                const string& reporter = entry.first;
                const auto& reportedUsers = entry.second;
                
                if (reportedUsers.count(id_list[i])) {
                    answer[find(id_list.begin(), id_list.end(), reporter) - id_list.begin()]++;
                }
            }
        }
    }

    return answer;
}

int main() {
    vector<string> id_list = {"muzi", "frodo", "apeach", "neo"};
    vector<string> report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;
    vector<int> result = solution(id_list, report, k);

    for (int mailCount : result) {
        cout << mailCount << " ";
    }

    return 0;
}
