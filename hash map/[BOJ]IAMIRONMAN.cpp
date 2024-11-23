#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

unordered_map<string, int> m;

int main() {
	int n, p;
	cin >> n >> p;
	int w, l, g;
	cin >> w >> l >> g;
	for (int i = 0; i < p;i++) {
		string s, w;
		cin >> s >> w;
		if (w == "W") {
			m[s] = 1;
		}
		else {
			m[s] = 0;
		}
	}
    int score = 0; 
    for (int i = 0; i < n; i++) {
        string player;
        cin >> player;

        
        if (m.find(player) != m.end()) {
            if (m[player] == 1) {
                score += w; 
            }
            else {
                score = max(0, score - l);
            }
        }
        else {
            
            score = max(0, score - l);
        }

       
        if (score >= g) {
            cout << "I AM NOT IRONMAN!!" << endl;
            return 0;
        }
    }

    cout << "I AM IRONMAN!!" << endl;
    return 0;
	
}
