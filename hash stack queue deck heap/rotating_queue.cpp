#include <iostream>
#include <deque>
#include <algorithm>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    
    deque<int> dq;
    
    for (int i = 1; i <= N; i++) {
        dq.push_back(i);
    }
    
    int result = 0;
    
    for (int i = 0; i < M; i++) {
        int target;
        cin >> target;
        int pos = find(dq.begin(), dq.end(), target) - dq.begin();
        if (pos < dq.size() - pos) {
            result += pos;
            while (pos--) {
                dq.push_back(dq.front());
                dq.pop_front();
            }
        } else {
            result += dq.size() - pos;
            int right_moves = dq.size() - pos;
            while (right_moves--) {
                dq.push_front(dq.back());
                dq.pop_back();
            }
        }
        dq.pop_front();
    }
    
    cout << result << endl;
    return 0;
}
