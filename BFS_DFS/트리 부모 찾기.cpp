#include <iostream>
#include <vector>

using namespace std;


void dfs(int current, vector<vector<int>>& tree, vector<int>& parent) {
	for (int neighbor : tree[current]) {
		if (parent[neighbor] == 0) {
			parent[neighbor] = current;
			dfs(neighbor, tree, parent);
		}
	}
}

int main() {
	int n;
	cin >> n;
	vector<vector<int>> tree(n + 1);
	vector<int> parent(n + 1, 0); 
	for (int i = 0; i < n-1; i++) {
		int a, b;
		cin >> a >> b;
		tree[a].push_back(b);
		tree[b].push_back(a);
	}
	parent[1] = 1;
	dfs(1, tree, parent);
	for (int i = 2; i <= n; ++i) {
		cout << parent[i] << '\n';
	}
	return 0;
}