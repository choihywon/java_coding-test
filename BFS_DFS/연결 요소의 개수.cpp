#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int visited[1001];
int map[1001][1001];


void dfs(int node, const vector<vector<int>>& map, vector<int>& visited) {
	visited[node] = 1;
	for (int i = 1; i < map.size(); i++) {
		if (!visited[i] && map[node][i] == 1) {
			dfs(i, map, visited);
		}
	}
}

int main() {
	int n, m;
	cin >> n >> m;
	vector<vector<int>> map(n + 1, vector<int>(n + 1, 0));
	vector<int> visited(n + 1, 0);

	for (int i = 0; i < m;i++) {
		int u, v;
		cin >> u >> v;
		map[u][v] = 1;
		map[v][u] = 1;
	}
	int cnt = 0;
	for (int i = 1; i <= n; i++) {
		if (!visited[i]) {
			dfs(i, map, visited);
			cnt++;
		}
	}
	cout << cnt << '\n';
	return 0;
}