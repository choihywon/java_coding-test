#include <iostream>
#include <map>
#include <string>

using namespace std;

int main(void) {
    map<string, string> m;

    int n, k;
    cin >> n >> k;

    for (int i = 0;i < n;i++) {
        string group;
        cin >> group;
        int memberCnt;
        cin >> memberCnt;
        for (int j = 0; j < memberCnt;j++) {
            string member;
            cin >> member;
            m[member] = group;
        }

    }

    for (int i = 0;i < k;i++) {
        map<string, string>::iterator iter;
        string result;
        cin >> result;

        int Q;
        cin >> Q;

        if (Q == 1) {
            iter = m.find(result);
            if (iter != m.end()) {
                cout << iter->second << '\n';
            }
        }
        else if (Q == 0) {

            for (iter = m.begin();iter != m.end();iter++) {
                if (iter->second == result) {
                    cout << iter->first << '\n';
                }
            }
        }
    }

}