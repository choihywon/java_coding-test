#include <iostream>
#include <queue>
#include <string>

using namespace std;

int main() {
   int n;
    cin >> n;
    deque<int> q;
    int num;
    int data;
    for(int i = 0; i<n; i++) {
        string str;
        cin >> str;
        if(str == "push_back") {
            cin >> data;
            q.push_back(data);
        } else if(str == "push_front") {
            cin >> data;
            q.push_front(data);
        } else if(str == "pop_front") {
            if(q.empty()) cout << -1 << endl;
            else {
                cout << q.front() << endl;
                q.pop_front();
            }
        } else if (str == "pop_back") {
            if(q.empty()) cout << -1 << endl;
            else {
                cout << q.back() << endl;
                q.pop_back();
            }
        } else if (str == "size") {
            cout << q.size()<<endl;
        } else if(str == "empty") {
            if(q.empty()) cout << 1 << endl;
            else cout << 0 << endl;
        } else if (str == "front") {
            if(q.empty()) cout << -1 << endl;
            else cout << q.front() << endl;
        } else if (str == "back") {
            if(q.empty()) cout << -1 << endl;
            else cout << q.back() << endl;
        }
        
    }

}
