#include <iostream>
#include <string>
#include <stack>

using namespace std;

bool isValid(string s) {
    stack<char> stack;
    for (char c : s) {
        if (c == '{' || c == '(' || c == '[') {
            stack.push(c);
        }
        else {
            if (stack.empty()) return false;
            char top = stack.top();
            stack.pop();
            if ((top != '(' && c == ')') ||
                (top != '{' && c == '}') ||
                (top != '[' && c == ']')) {
                return false;
            }
        }
    }
    return stack.empty();
}

int solution(string s) {
    int answer = 0;
    for (int i = 0; i < s.length(); i++) {
        string sub = s.substr(i) + s.substr(0, i);
        if (isValid(sub)) answer++;
    }
    return answer;
}




int main() {
    string s1 = "[](){}";
    string s2 = "}]()[{";
    string s3 = "[)(]";
    string s4 = "}}}";
    solution(s1);
    solution(s2);
    solution(s3);
    solution(s4);
}