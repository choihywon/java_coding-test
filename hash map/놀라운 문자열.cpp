#include <iostream>
#include <unordered_set>
#include <string>

using namespace std;

bool isSurprising(const string& str) {
    int N = str.size();

    for (int D = 0; D <= N - 2; ++D) {
        unordered_set<string> pairs;

        for (int i = 0; i + D + 1 < N; ++i) {
            string pair = { str[i], str[i + D + 1] };

            if (pairs.find(pair) != pairs.end()) {
                return false;
            }

            pairs.insert(pair);
        }
    }

    return true;
}

int main() {
    string str;

    while (cin >> str && str != "*") {
        cout << str << " is ";
        if (!isSurprising(str)) {
            cout << "NOT ";
        }
        cout << "surprising." << endl;
    }

    return 0;
}
