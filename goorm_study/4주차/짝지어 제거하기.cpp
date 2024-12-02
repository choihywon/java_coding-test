#include <iostream>
#include<string>
#include <stack>
#include <vector>

using namespace std;

int solution(string s)
{
    stack<char>st;
    for (char c : s) {
        if (!st.empty() && st.top() == c) st.pop();
        else st.push(c);
    }
    if (st.empty()) return 1;
    else return 0;

}

int main() {
    cout << solution("baabaa") << '\n';
    cout << solution("cdcd") << '\n';
}