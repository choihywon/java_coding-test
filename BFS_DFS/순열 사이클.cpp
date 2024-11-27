#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;

void dfs(int node, vector<int> &visited, vector<vector<int>>& adj) {
	visited[node] = 1;
	for (int next : adj[node]) {
		if (!visited[next]) {
			dfs(next, visited, adj);
		}
	}
}

int main() {
	int T;
	cin >> T;
	for (int i = 0; i < T; i++) {
		int n;
		cin >> n;
		vector<int> visited(n + 1, 0); 
		vector<vector<int>> adj(n + 1); 


		for (int j = 1; j <= n; j++) {
			int s;
			cin >> s;
			adj[j].push_back(s);
		}

		int cnt = 0;
		for (int j = 1; j <= n; j++) {
			if (!visited[j]) {
				dfs(j, visited, adj);
				cnt++;
			}
		}
		cout << cnt << '\n';

	}
	return 0;
}