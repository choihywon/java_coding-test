#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int visited[1001];
int map[1001][1001];


int dfs(int n) {
	visited[n] = 1;
	int cnt = 0;
	for (int i = 1; i <= n; i++) {
		if (visited[i] != 1 && map[n][i] == 1) {
			dfs(i);
			cout << i << ' ';
		}
		
			
	}
	return cnt;
}

int main() {
	int n, m;
	cin >> n >> m;
	int u, v;
	for (int i = 0; i < m;i++) {
		
		cin >> u >> v;
		map[u][v] = 1;
		map[v][u] = 1;
	}
	int res = dfs(v);
	cout << res << '\n';
}