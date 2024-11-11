#include <iostream>
#include <unordered_map>
#include <cstdio>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    unordered_map<int, int> m;
    int N, M, card;

    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> card;
        m[card]++;
    }

    cin >> M;
    for (int i = 0; i < M; i++) {
        cin >> card;
        cout << m[card] << " ";
    }

    return 0;
}
