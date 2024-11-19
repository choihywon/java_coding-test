#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
	int t;
	cin >> t;
	for (int i = 0; i < t; i++) {
		int k;
		cin >> k;
		map<string, int>m;
		for (int j = 0; j < k; j++) {
			string a, b;
			cin >> a >> b;
			m[b]++;
		}
		int res = 1;
		for (auto type : m) {
			res *= (type.second + 1);
		}
		cout << res - 1 << "\n";
	}
}