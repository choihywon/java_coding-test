#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <stack>

using namespace std;

int dfs(int n, const vector<vector<int>>& map) {
	vector<int> visited(n + 1, 0);
	stack<int> st;
	int cnt = 0;
	for (int i = 1; i <= n; i++) {
		if (visited[i]) continue;
		cnt++;
		st.push(i);
		while (!st.empty()) {
			int node = st.top();
			st.pop();
			if (visited[node]) continue;
			visited[node] = 1;
			for (int i = 1; i <= n; i++) {
				if (!visited[i] && map[node][i] == 1)
					st.push(i);
			}
		}
	}
	return cnt;
}

int main() {
	int n, m;
	cin >> n >> m;
	vector<vector<int>> map(n + 1, vector<int>(n + 1, 0));
	//vector<int> visited(n + 1, 0);
	for (int i = 0;i < m; i++) {
		int u, v;
		cin >> u >> v;
		map[u][v] = 1;
		map[v][u] = 1;
	}

	cout << dfs(n, map) << '\n';
	return 0;
} 