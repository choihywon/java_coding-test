#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int dfs(int node, vector<int>& visited, vector<vector<int>>& map) {
	visited[node] = 1;
	int count = 0;

	for (int next : map[node]) {
		if (!visited[next]) {
			count += 1 + dfs(next, visited, map);
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
    int infected_count = dfs(1, visited, map);

    cout << infected_count << endl;

    return 0;
}