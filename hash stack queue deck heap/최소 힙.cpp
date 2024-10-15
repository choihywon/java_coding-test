include <queue>
#include <iostream>
using namespace std;
 
int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
 
    priority_queue <int,vector<int>,greater<int>> q;
 
    int N;
 
    cin >> N;
    
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        if (tmp != 0) {
            q.push(tmp);
        }
        else {
            if (q.empty()) cout << 0 << '\n';
            else {
                cout << q.top() << '\n';
                q.pop();
            }
        }
    }
    return 0;
}

