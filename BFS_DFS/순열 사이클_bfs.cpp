#include <iostream>
#include <vector>
#include <queue>


using namespace std;

int bfs(int node, vector<int>&visited, vector<vector<int>>&map) {
	queue<int> q;
	q.push(node);
	visited[node] = 1;
	while (!q.empty()) {
		int current = q.front();
		q.pop();
		for (int next : map[current]) {
			if (!visited[next]) {
				visited[next] = 1;
				q.push(next);
			}
		}
	}
}

int main() {
	int T;
	cin >> T;

	for (int t = 0; t < T; t++) {
		int N;
		cin >> N;
		vector<int> visited(N + 1, 0);
		vector<vector<int>> map(N + 1);
		for (int n = 0; n < N; n++) {
			int num;
			cin >> num;
			map[n].push_back(num - 1);
		}
		int cnt = 0;

		for (int j = 1; j <= N; j++) {
			if (!visited[j]) {
				bfs(j, visited, map);
				cnt++;
			}
		}
		cout << cnt << '\n';
		
	}
}