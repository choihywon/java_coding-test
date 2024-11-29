#include <iostream>
#include <vector>
#include <queue>


using namespace std;

int bfs(int start, vector<int>& visited, vector<vector<int>>& map) {
    queue<int> q;
    q.push(start);
    visited[start] = 1;

    int count = 0;

    while (!q.empty()) {
        int node = q.front();
        q.pop();

        for (int next : map[node]) {
            if (!visited[next]) {
                visited[next] = 1;
                q.push(next);
                count++; 
            }
        }
    }
    return count;
}

int main() {
    int computer, pair;
    cin >> computer >> pair;

    vector<vector<int>> map(computer + 1);
    vector<int> visited(computer + 1, 0);

    for (int i = 0; i < pair; i++) {
        int a, b;
        cin >> a >> b;
        map[a].push_back(b);
        map[b].push_back(a);
    }

    int infected_count = bfs(1, visited, map);

    cout << infected_count << endl;

    return 0;
}
