#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool solution(string s)
{   
    stack<char> st;
    for (char c : s) {
        if (c == '(') {
            st.push('(');
        }
        else if (c == ')') {
            if (st.empty())
                return false;
            st.pop();
        }
       
    } 
    if (!st.empty())
        return false;
    return true;
}

int main() {
    string testCases[] = {
        "()()",      // true
        "(())()",    // true
        ")()(",      // false
        "(()("       // false
    };

    cout << "=== 테스트 결과 ===" << endl;
    for (const auto& testCase : testCases) {
        bool result = solution(testCase);
        cout << "Input: " << testCase << ", Result: " << (result ? "true" : "false") << endl;
    }

    return 0;
}