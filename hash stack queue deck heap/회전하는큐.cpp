#include <iostream>
#include <stack>
#include <string>
using namespace std;

int solution(string s) {
    int n = s.length();
    int count = 0;

    for (int i = 0; i < n; i++) {
        stack<char> st;
        bool isValid = true;
        for (int j = 0; j < n; j++) {
            char ch = s[j];
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.empty()) {
                    isValid = false;
                    break;
                }
                char top = st.top();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid && st.empty()) {
            count++; 
        }

        s = s.substr(1) + s[0];
    }

    return count;
}

int main() {
    string s;
    cin >> s;

    cout << solution(s) << endl;

    return 0;
}
