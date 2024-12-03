#include <iostream>
#include <vector>
#include <queue>
#include <cstring>

using namespace std;

void bfs(int x, int y, vector<vector<int>>& map, vector<vector<bool>>& visited, int M, int N) {
	int dx[4] = { 0,0,1,-1 };
	int dy[4] = { 1,-1,0,0 };
	queue<pair<int, int>>q;
	q.push({ x,y });
	visited[x][y] = 1;
	while (!q.empty()) {
		int cx = q.front().first; //행 값
		int cy = q.front().second; //열 값
		q.pop();
		for (int i = 0; i < 4; i++) {
			int nx = cx + dx[i];
			int ny = cy + dy[i];

			if (nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == 1 && !visited[nx][ny]) {
				q.push({ nx,ny });
				visited[nx][ny] = true;
			}
		}
	}
}

int main() {
	int T;
	cin >> T;
	for (int t = 0; t < T; t++) {
		int M, N, K;
		cin >> M >> N >> K;
		vector<vector<int>> map(M, vector<int>(N, 0));
		vector<vector<bool>> visited(M, vector<bool>(N, false));
		for (int k = 0; k < K; k++) {
			int x, y;
			cin >> x >> y;
			map[x][y] = 1;
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					bfs(i, j, map, visited, M, N);
					count++;
				}
			}
		}
		cout << count << "\n";

	}
}