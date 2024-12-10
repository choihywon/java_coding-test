#include <iostream>
#include <vector>

using namespace std;

//문제가 딱 봐도 순열임 nPr 그거....
//n(n-1)...(n-k)까지임

void dfs(int n, int m, vector<int>& sequence, vector<bool>& visited, int depth) {
	if (depth == m) {
		for (int num : sequence) {
			cout << num << " ";
		}
		cout << '\n';
		return;
	}
	for (int i = 1; i <= n; i++) {
		if (!visited[i]) {
			visited[i] = true;
			sequence.push_back(i);
			dfs(n, m, sequence, visited, depth + 1);
			visited[i] = false;
			sequence.pop_back();
		}
	}
}


int main() {
	int n, m;
	cin >> n >> m;
	
	vector<int> sequence;
	vector<bool> visited(n + 1, false);
	dfs(n, m, sequence, visited, 0);

}